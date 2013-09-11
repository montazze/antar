package com.github.khannedy.antar.node
import com.github.khannedy.antar.api.{AntarResponseMessage, AntarRequestMessage, AntarService}

/**
 * @author Eko Khannedy
 */
class AntarServiceNode extends AntarService.Iface {

  def ping(): Boolean = true

  def send(request: AntarRequestMessage): AntarResponseMessage = {
    val response = new AntarResponseMessage
    response.code = "200"
    response.message = "OK"

    response
  }
}
