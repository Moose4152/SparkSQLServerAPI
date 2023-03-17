package server

import com.github.msr.{SparkAPI, TResults}
import org.apache.spark.sql.SparkSession
import processor.Engine

class QueryHandler extends SparkAPI.Iface{
//  val spark = SparkSession.builder().master("local[6]").appName("SparkAPIBackend").getOrCreate()
  val basePath = "/Users/mayanksinghrana/Desktop/TdigestExp/Functional/rollup1/"
  override def exectureCommand(sql_statment: String): TResults = {
    try{
      val sqlContext = Engine.sqlContext()
      val df = sqlContext.read.parquet(basePath)
      df.createOrReplaceTempView("RawTable")
      val dfTemp = sqlContext.sql(sql_statment)
      dfTemp.show()
      val result = new TResults()
      val collectedResult = dfTemp.collect()
      val res: Seq[Seq[String]] = collectedResult.toSeq.map(_.toSeq.map(x => {
        try{
          x.toString
        } catch {
          case _ => "0"
        }
      }))
      result.setResults(scala.collection.JavaConverters.seqAsJavaList(res.map(m => scala.collection.JavaConverters.seqAsJavaList(m))))
      val schema: Seq[String] = dfTemp.columns.toSeq
      result.setSchema(scala.collection.JavaConverters.seqAsJavaList(schema))
      result
    } catch {
      case e:Exception =>
        val messag = e.getMessage
        val result = new TResults()
        val res = Seq(Seq("d1","e"),Seq("has","iad"))
        result.setResults(scala.collection.JavaConverters.seqAsJavaList(res.map(m => scala.collection.JavaConverters.seqAsJavaList(m))))
        val schema = Seq("asd")
        result.setSchema(scala.collection.JavaConverters.seqAsJavaList(schema))
        result.setErrorMessage(messag)
        result
    }

  }

  override def readFile(pathOfFile: String): String = {
    "Done"
  }
}
