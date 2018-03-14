package org.afterhourz.scalastarter.core

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer

trait ApplicationContext {


  implicit val system = ActorSystem("flights-system")
  implicit val materializer = ActorMaterializer()

  val appConfig: ApplicationConfig = ApplicationConfig.fromFile()

}
