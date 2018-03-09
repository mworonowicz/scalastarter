package org.afterhourz.scalastarter.fares

import org.afterhourz.scalastarter.flights.model.Schedule

class FaresClient {

  def findFare(schedule: Schedule, quantity: Int):  Option[Fare] =
    for {
      fare <- if (schedule.date.getDayOfMonth % 2 == 0) Some(Fare(100.0, quantity)) else None
    } yield fare

}
