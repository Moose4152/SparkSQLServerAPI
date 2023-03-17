package server
import thrift.QueryServer

object Main {
  def main(args:Array[String]):Unit = {
   val server = new QueryServer()
   val handler = new QueryHandler()
   val port = 9103
    server.startServer(port,handler)
  }
}
