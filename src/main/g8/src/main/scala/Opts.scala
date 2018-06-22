import io.circe._
import io.circe.generic.auto._
import io.circe.parser._
import io.circe.syntax._

import org.rogach.scallop._

import scala.io.Source
import scala.util.Try

/**
 * Command line argument parsing.
 */
class Opts(args: Array[String]) extends ScallopConf(args) {
  val message = opt[String]()

  // parse the arguments
  verify
}

/**
 * Companion object for parsing JSON config files.
 */
object Opts {

  /**
   * Read a JSON file, parse, and decode it.
   */
  def loadOptsFile[T](path: String): Try[Json] = {
    Try(Source.fromFile(path).mkString) flatMap {
      json => parse(json).flatMap(_.as[T]).toTry
    }
  }
}
