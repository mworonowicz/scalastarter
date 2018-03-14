package org.afterhourz.scalastarter

import akka.http.scaladsl.Http
import org.afterhourz.scalastarter.core.{ApplicationContext, Routing}


object WebServer extends App with Routing with ApplicationContext  {

  Http().bindAndHandle(route,appConfig.host,appConfig.port)

}
