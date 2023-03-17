package thrift;

import com.github.msr.SparkAPI;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import server.QueryHandler;
public class QueryServer {
    public static SparkAPI.Processor processor;

    public void startServer(final int port, QueryHandler h){
        try{
            processor = new SparkAPI.Processor(h);
            Runnable simple = new Runnable() {
                @Override
                public void run() {
                    simple(processor,port);
                }
            };
            new Thread(simple).start();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void simple(SparkAPI.Processor processor, int port){
        try{
            TServerTransport serverTransport = new TServerSocket(port);
            TThreadPoolServer.Args args = new TThreadPoolServer.Args(serverTransport).processor(processor);
            args.maxWorkerThreads(10);
            TServer server = new TThreadPoolServer(args);
            server.serve();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
