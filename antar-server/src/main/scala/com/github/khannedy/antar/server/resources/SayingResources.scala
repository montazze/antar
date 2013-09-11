package com.github.khannedy.antar.server.resources
import javax.ws.rs.{GET, QueryParam, Produces, Path}
import javax.ws.rs.core.MediaType
import com.github.khannedy.antar.server.core.Saying
import com.yammer.metrics.annotation.Timed
import com.google.common.base.Optional
import org.slf4j.LoggerFactory

/**
 * @author Eko Khannedy
 */
@Path("/saying")
@Produces(Array(MediaType.APPLICATION_JSON))
class SayingResources {

  val LOG = LoggerFactory.getLogger(classOf[SayingResources])

  @GET
  @Timed
  def sayHello(@QueryParam("name") name: Optional[String]): Saying = {

    LOG.info("sayHello with name " + name.orNull())

    val response: Saying = new Saying
    response.id = System.currentTimeMillis()
    response.content = "Hello " + name.or("NONAME")

    LOG.info("finish fill response")

    return response
  }

}
