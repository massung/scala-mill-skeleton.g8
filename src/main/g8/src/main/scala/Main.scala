import cats._
import cats.effect._
import cats.implicits._

import com.typesafe.config.ConfigFactory
import com.typesafe.scalalogging.Logger

import scala.concurrent.ExecutionContext.Implicits.global

object Main {
  val config = ConfigFactory.load()
  val logger = Logger("ROOT")

  /** Entry point. */
  def main(args: Array[String]): Unit = {
    val opts = new Opts(config, args)

    val io = IO {
      println(opts.msg.getOrElse(config.getString("test.message")))
    }

    // run the program
    io.unsafeRunSync
  }
}
