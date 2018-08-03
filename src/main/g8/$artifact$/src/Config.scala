package $group$.$artifact$

import java.io.File
import java.io.PrintWriter

import org.json4s._
import org.json4s.jackson.Serialization.{read, writePretty}

import scala.io.Source

/** Custom settings for the application. */
case class Config(message: String) {
  implicit val formats = DefaultFormats

  /** Write the custom settings to disk. */
  def save(file: File) = {
    val json = writePretty(this)
    val writer = new PrintWriter(file)

    writer.write(json)
    writer.close
  }
}

/** Companion object resposible for loading. */
object Config {
  implicit val formats = DefaultFormats

  /** Default configuration. */
  val DefaultConfig = Config("Hello, world!")

  /** Load and parse a configuration file. */
  def load(file: File): Config = {
    read[Config](Source.fromFile(file).mkString)
  }
}
