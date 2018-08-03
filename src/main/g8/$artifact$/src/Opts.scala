package $group$.$artifact$

import java.io.File

import org.rogach.scallop._

/** Command line argument parsing. */
class Opts(args: Array[String]) extends ScallopConf(args) {
  val configFile = opt[File]("config")
  val ver = opt[Boolean]("version")

  // TODO: custom command line parameters here...

  // ensure the configuration file exists if provided
  validateFileExists(configFile)

  // parse the arguments
  verify

  /** Loads and parses the configuration file. */
  lazy val config: Config = configFile
    .map(Config.load)
    .getOrElse(Config.DefaultConfig)
}
