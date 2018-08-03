import mill._
import mill.scalalib._

object $artifact$ extends ScalaModule {
  def scalaVersion = "$scala_version$"

  // compile flags
  def scalacOptions = Seq(
    "-feature",
    "-deprecation",
    "-Ypartial-unification",
    "-Ywarn-value-discard"
  )

  // entry point
  def mainClass = Some("$group$.$artifact$.Main")

  // dependency versions
  val cats = "1.1.0"
  val config = "1.3.2"
  val effect = "0.10.1"
  val json4s = "3.5.3"
  val logback = "1.2.3"
  val logging = "3.7.2"
  val scallop = "3.1.2"

  // dependencies
  def ivyDeps = Agg(
    ivy"ch.qos.logback:logback-classic:\$logback",
    ivy"com.typesafe:config:\$config",
    ivy"com.typesafe.scala-logging::scala-logging:\$logging",
    ivy"org.json4s::json4s-jackson:\$json4s",
    ivy"org.rogach::scallop:\$scallop",
    ivy"org.typelevel::cats-core:\$cats",
    ivy"org.typelevel::cats-effect:\$effect"
  )
}
