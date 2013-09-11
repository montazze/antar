package com.github.khannedy.antar.node
import org.apache.thrift.transport.TSocket
import org.apache.thrift.protocol.TBinaryProtocol
import com.github.khannedy.antar.api.{AntarMessageType, AntarRequestMessage}
import com.github.khannedy.antar.api.AntarService.Client

/**
 * @author Eko Khannedy
 */
object MainClient {

  def main(args: Array[String]) {

    val transport = new TSocket("localhost", 9999);
    transport.open();

    val protocol = new TBinaryProtocol(transport);

    val client = new Client(protocol)

    println(client.ping())

    val request = new AntarRequestMessage()
    request.`type` = AntarMessageType.HTTP_NOTIFICATION
    request.messageId = "10106031"
    request.ownerId = "merchant1"

    val response = client.send(request)

    println(response.code)
    println(response.message)

    transport.close()
  }

}
