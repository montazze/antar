package com.github.khannedy.antar.server
import com.yammer.dropwizard.ScalaService
import com.yammer.dropwizard.config.{Bootstrap, Environment}
import com.github.khannedy.antar.server.resources.SayingResources
import org.slf4j.LoggerFactory

/**
 * @author Eko Khannedy
 */
object Main extends ScalaService[AntarServerConfiguration] {

  val LOG = LoggerFactory.getLogger(getClass)

  def initialize(bootstrap: Bootstrap[AntarServerConfiguration]) {
    LOG.info("initialize antar application")
    bootstrap.setName("Antar Server")
  }

  def run(configuration: AntarServerConfiguration, environment: Environment) {
    LOG.info("run antar application")
    environment.addResource(new SayingResources)
  }
}
