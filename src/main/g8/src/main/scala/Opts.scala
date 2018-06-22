import java.io.File

import org.json4s._
import org.json4s.jackson.JsonMethods._
import org.json4s.jackson.Serialization._

import org.rogach.scallop._

import scala.io.Source

/**
 * Command line argument parsing.
 */
class Opts(args: Array[String]) extends ScallopConf(args) {
  implicit val formats = DefaultFormats

  /** Configuration file. */
  val configFile = opt[File]("config")

  // ensure the configuration file exists if provided
  validateFileExists(configFile)

  // parse the arguments
  verify

  // parse the configuration file
  lazy val config = configFile.map {
    file => read[Opts.Config](Source.fromFile(file).mkString)
  }.getOrElse(Opts.DefaultConfig)
}

/**
 * Companion object with private configurations.
 */
object Opts {

  /** Configuration file settings. */
  case class Config(message: String)

  /** The default configuration if none provided. */
  val DefaultConfig = Config(
    message="Hello, world!"
  )
}
