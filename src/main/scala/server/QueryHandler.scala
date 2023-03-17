package server

import com.github.msr.{SparkAPI, TResults}
import org.apache.spark.sql.SparkSession

class QueryHandler extends SparkAPI.Iface{
  val spark = SparkSession.builder().master("local[6]").appName("SparkAPIBackend").getOrCreate()
  val basePath = "/Users/mayanksinghrana/Desktop/TdigestExp/Functional/rollup1/"
  override def exectureCommand(sql_statment: String): TResults = {
    val df = spark.read.parquet(basePath)
    df.createOrReplaceTempView("RawTable")
    val dfTemp = spark.sql(sql_statment)
    dfTemp.show()
    val result = new TResults()
    val collectedResult = dfTemp.collect()
    val res = collectedResult.toSeq.map(_.toSeq.map(x => {
      try{
        x.toString
      } catch {
        case _ => "0"
      }
    }))
    result.setResults(scala.collection.JavaConverters.seqAsJavaList(res.map(m => scala.collection.JavaConverters.seqAsJavaList(m))))
    val schema = dfTemp.columns.toSeq
    result.setSchema(scala.collection.JavaConverters.seqAsJavaList(schema))
    result
  }

  override def readFile(pathOfFile: String): String = {
    "Done"
  }
}
