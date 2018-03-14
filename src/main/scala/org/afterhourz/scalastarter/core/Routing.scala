package org.afterhourz.scalastarter.core

import akka.http.scaladsl.server.{Directives, Route}
import org.afterhourz.scalastarter.flights.controller.FlightsController


trait Routing extends FlightsController {

  override def route =
    super[FlightsController].route

}


trait Controller extends Directives {

  def route: Route
}


