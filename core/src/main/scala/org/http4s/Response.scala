package org.http4s

import scala.concurrent.Future

import play.api.libs.iteratee.Enumerator

case class Response(
  statusLine: StatusLine = StatusLine.Ok,
  headers: Headers = Headers.Empty,
  entityBody: Enumerator[Chunk] = Enumerator.eof
)

case class StatusLine(code: Int, reason: String)

object StatusLine {
  val Ok = StatusLine(200, "OK")
}
