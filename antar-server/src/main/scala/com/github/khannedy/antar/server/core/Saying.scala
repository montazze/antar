package com.github.khannedy.antar.server.core
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @author Eko Khannedy
 */
class Saying {

  @JsonProperty
  var id: Long = 0

  @JsonProperty
  var content: String = ""

}
