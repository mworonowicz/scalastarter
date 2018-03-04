package org.afterhourz.scalastarter.core

import cats.data.Reader
import monix.eval.Task
import org.afterhourz.scalastarter.flights.FlightsContext
import org.atnos.eff.EitherEffect._
import org.atnos.eff.{Fx, |=}

object Stack {

  type ReaderFlightsContext[A] = Reader[FlightsContext, A]

  type _readerFC[R] = ReaderFlightsContext |= R

  type FlightsStack = Fx.fx3[Task, ReaderFlightsContext, ThrowableEither]
}
