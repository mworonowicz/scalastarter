package org.afterhourz.scalastarter.core

import com.typesafe.config.ConfigFactory


case class ApplicationConfig(host : String = "0.0.0.0", port: Int = 8888)

object ApplicationConfig {

  def fromFile(): ApplicationConfig =  {
    val config = ConfigFactory.load().getConfig("app")
    ApplicationConfig(config.getString("host"),config.getInt("port"))
  }

}
