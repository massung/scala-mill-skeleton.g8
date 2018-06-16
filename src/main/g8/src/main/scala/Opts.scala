import org.rogach.scallop._

/**
 * Command line argument parsing.
 */
class Opts(args: Array[String]) extends ScallopConf(args) {
  val message = opt[String]()

  // parse the arguments
  verify
}
