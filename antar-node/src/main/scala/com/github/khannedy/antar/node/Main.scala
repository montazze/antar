package com.github.khannedy.antar.node
import org.apache.thrift.transport.{TServerTransport, TServerSocket}
import org.apache.thrift.server.{TThreadPoolServer, TServer}
import com.github.khannedy.antar.api.AntarService

/**
 * @author Eko Khannedy
 */
object Main {

  def main(args: Array[String]) {

    val service = new AntarServiceNode
    val processor = new AntarService.Processor[AntarServiceNode](service)

    val serverTransport: TServerTransport = new TServerSocket(9999)

    val server: TServer = new TThreadPoolServer(new TThreadPoolServer.Args(serverTransport).processor(processor));

    server.serve()

  }

}
