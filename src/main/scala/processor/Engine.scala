package processor

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SQLContext

object Engine {


  val localSparkConf = new SparkConf().setAppName("SparkAPIServer").setMaster("local[*]")
  var currentActiveSQLContext:SQLContext = null
  var currentActiveSparkContext:SparkContext = null

  val sparkContext = () => this.synchronized {
    if (currentActiveSparkContext != null) {
      if (currentActiveSparkContext.isStopped) {
        println("SparkContext Crashed. Restarting Spark Context")
        currentActiveSparkContext.stop()
        Thread.sleep(60000)
        currentActiveSparkContext = {
          val sc = new SparkContext(localSparkConf)
          sc.setLocalProperty("spark.scheduler.pool", "default")
          import java.util.concurrent.Executors

          import concurrent.ExecutionContext
          val executorService = Executors.newFixedThreadPool(50)
          implicit val ec = ExecutionContext.fromExecutorService(executorService)
          sc
        }
      }
    }
    else {
      currentActiveSparkContext = {
        val sc = new SparkContext(localSparkConf)
        sc.setLocalProperty("spark.scheduler.pool", "default")
        import java.util.concurrent.Executors
        import concurrent.ExecutionContext
        val executorService = Executors.newFixedThreadPool(50)
        implicit val ec = ExecutionContext.fromExecutorService(executorService)
        sc
      }
    }
    currentActiveSparkContext
  }

  val sqlContext = () => this.synchronized {
    if (currentActiveSQLContext != null) {
      if (currentActiveSQLContext.sparkContext.isStopped) {
        currentActiveSQLContext = {
          val tempSQLContext = new SQLContext(sparkContext())
          tempSQLContext
        }
      }
    }
    else {
      currentActiveSQLContext = {
        val tempSQLContext = new SQLContext(sparkContext())
        tempSQLContext
      }
    }
    currentActiveSQLContext
  }

}
