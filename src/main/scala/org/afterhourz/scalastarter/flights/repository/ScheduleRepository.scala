package org.afterhourz.scalastarter.flights.repository

import java.time.{LocalDate, LocalDateTime}

import monix.eval.Task
import org.afterhourz.scalastarter.flights.model.{Connection, Schedule}
import org.atnos.eff.Eff
import org.atnos.eff.addon.monix.task._

import scala.concurrent.Future

class ScheduleRepository {


  def getSchedule(startDate: LocalDate, endDate: LocalDate): List[Schedule] = ???

}
