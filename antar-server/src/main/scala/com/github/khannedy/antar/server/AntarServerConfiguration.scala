package com.github.khannedy.antar.server
import com.yammer.dropwizard.config.Configuration
import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.validator.constraints.NotEmpty

/**
 * @author Eko Khannedy
 */
class AntarServerConfiguration extends Configuration {

  @NotEmpty
  @JsonProperty
  var name: String = "Antar Server"

}
