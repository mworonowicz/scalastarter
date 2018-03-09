package org.afterhourz.scalastarter.flights

import org.afterhourz.scalastarter.fares.FaresClient
import org.afterhourz.scalastarter.flights.repository.{ConnectionRepository, ScheduleRepository}

trait FlightsContext {

  def connectionRepository: ConnectionRepository
  def scheduleRepository: ScheduleRepository
  def faresClient: FaresClient
}
