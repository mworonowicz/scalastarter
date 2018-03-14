package org.afterhourz.scalastarter.flights.controller

import org.afterhourz.scalastarter.core.Controller

trait FlightsController extends Controller {

  def route = path("flights") {
      get {
        complete("ok")
      }
  }


}
