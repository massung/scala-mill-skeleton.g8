name := "$name;format="Camel"$"

version := "$version$"

scalaVersion := "$scala_version$"

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-Ypartial-unification",
  "-Ywarn-value-discard"
)

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "co.fs2" %% "fs2-core" % "0.10.1",
  "com.typesafe" % "config" % "1.3.2",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2",
  "io.circe" %% "circe-core" % "0.9.3",
  "io.circe" %% "circe-generic" % "0.9.3",
  "io.circe" %% "circe-parser" % "0.9.3",
  "org.rogach" %% "scallop" % "3.1.2",
  "org.typelevel" %% "cats-core" % "1.1.0",
  "org.typelevel" %% "cats-effect" % "1.0.0-RC2"
)
