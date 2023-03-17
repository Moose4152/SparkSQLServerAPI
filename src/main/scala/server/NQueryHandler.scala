package server

import com.github.msr.{Delimiter, FileType, ReadData, SQLStatment, SparkAPI, TResults}
import processor.Engine

class NQueryHandler extends SparkAPI.Iface{
  private val sqlContext = Engine.sqlContext()

  override def exectureCommand(query: SQLStatment): TResults = {
    try{
      val df = sqlContext.sql(query.sql_statment)
      df.show()
      val result = new TResults()
      val collectedResult = df.collect()
      val res: Seq[Seq[String]] = collectedResult.toSeq.map(_.toSeq.map(x => {
        try{
          x.toString
        } catch {
          case _ => "0"
        }
      }))
      result.setResults(scala.collection.JavaConverters.seqAsJavaList(res.map(m => scala.collection.JavaConverters.seqAsJavaList(m))))
      val schema: Seq[String] = df.columns.toSeq
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

  override def readFile(file_to_read: ReadData): String = {
    file_to_read.dataType match {
      case FileType.Parquet =>
        val path = file_to_read.path
        val df = sqlContext.read.parquet(path)
        df.createOrReplaceTempView("RAW")
        df.show()
        "done"
      case FileType.Csv =>
        val df = file_to_read.delimiter match {
          case Delimiter.Comma =>
            sqlContext.read.option("delimiter",",").csv(file_to_read.path)
          case Delimiter.Tab =>
            sqlContext.read.option("delimiter","\t").csv(file_to_read.path)
          case Delimiter.Pipe =>
            sqlContext.read.option("delimiter","|").csv(file_to_read.path)
        }
        df.createOrReplaceGlobalTempView("RAW")
        "done"
      case FileType.Json =>
        "not defined"
    }
  }
}
