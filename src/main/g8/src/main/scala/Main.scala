import cats._
import cats.effect._
import cats.implicits._

import com.typesafe.config.ConfigFactory
import com.typesafe.scalalogging.Logger

import scala.concurrent.ExecutionContext.Implicits.global

object Main {
  val config = ConfigFactory.load()
  val logger = Logger(config.getString("logger.name"))

  /** Entry point. */
  def main(args: Array[String]): Unit = {
    val opts = new Opts(args)

    val io = IO {
      logger.info(opts.message.getOrElse("Hello, world!"))
    }

    // run the program
    io.unsafeRunSync
  }
}
