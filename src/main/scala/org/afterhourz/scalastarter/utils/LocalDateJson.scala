package org.afterhourz.scalastarter.utils

import java.time.format.DateTimeFormatter
import java.time.{LocalDate, LocalDateTime}

import akka.http.scaladsl.unmarshalling.Unmarshaller
import spray.json.{DefaultJsonProtocol, DeserializationException, JsString, JsValue, RootJsonFormat}

object LocalDateJson {

  trait LocalDateTimeProtocol extends DefaultJsonProtocol {
    implicit object LocalDateTimeJsonFormat extends RootJsonFormat[LocalDateTime] {
      def write(d: LocalDateTime) = JsString(d.toString)
      def read(value: JsValue) = {
        value match {
          case JsString(s) =>
            LocalDateTime.parse(s, DateTimeFormatter.ISO_DATE_TIME)
          case _ => throw DeserializationException("LocalDateTime expected")
        }
      }
    }
  }

  trait LocalDateProtocol extends DefaultJsonProtocol {
    implicit object LocalDateJsonFormat extends RootJsonFormat[LocalDate] {
      def write(d: LocalDate) = JsString(d.toString)
      def read(value: JsValue) = {
        value match {
          case JsString(s) =>
            LocalDate.parse(s, DateTimeFormatter.ISO_DATE)
          case _ => throw DeserializationException("LocalDate expected")
        }
      }
    }
  }

  val localDateUnmarshaller: Unmarshaller[String, LocalDate] =
    Unmarshaller.strict((d: String) => LocalDate.parse(d, DateTimeFormatter.ISO_DATE))

}
