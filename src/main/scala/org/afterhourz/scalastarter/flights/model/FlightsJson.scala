package org.afterhourz.scalastarter.flights.model

import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import org.afterhourz.scalastarter.utils.LocalDateJson.{LocalDateProtocol, LocalDateTimeProtocol}
import spray.json.DefaultJsonProtocol

object FlightsJson extends DefaultJsonProtocol with SprayJsonSupport with LocalDateTimeProtocol with LocalDateProtocol {

  implicit val connectionJson         = jsonFormat2(Connection)
  implicit val scheduleJson           = jsonFormat2(Schedule)
  implicit val offerJson              = jsonFormat2(Offer)
  implicit val flightSearchResultJson = jsonFormat2(FlightSearchResult)
}
