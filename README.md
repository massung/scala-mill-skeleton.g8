# Scala Skeleton App

This is a [Giter8][g8] skeleton for [Scala][scala].

## Getting Started

Download an install the following applications:

* [SBT][sbt]

Next, run [SBT][sbt] on the command line to initialize a new sekeleton.

```
$ sbt new massung/scala-skeleton.g8
```

It has a few things to make life a little easier setting up a new [Scala][scala] application:

* `.editorconfig` file for indentation
* `.gitignore` for obvious reasons

In the `build.sbt` file I arbitrarily chose some common libraries I use quite frequently for the skeleton:

* [typesafe logger][logger] and [logback-classic][logback] for SLF4J logging
* [typesafe config][config] for parsing `application.properties`
* [scallop][scallop] for command line parsing
* [json4s][json4s] for serializing JSON
* [cats][cats] and [cats-effect][effect] for monads, fibers, etc.
* [fs2][fs2] for streaming

It's also pre-setup for [Ensime][ensime], assuming you use it.

# fin.

[g8]:           http://www.foundweekends.org/giter8
[sbt]:          https://www.scala-sbt.org/index.html
[scala]:        http://www.scala.org
[ensime]:       http://ensime.github.io/
[logback]:      https://logback.qos.ch/
[logger]:       https://github.com/lightbend/scala-logging
[config]:       https://lightbend.github.io/config/
[scallop]:      https://github.com/scallop/scallop
[json4s]:       http://json4s.org/
[cats]:         https://typelevel.org/cats/
[effect]:       https://typelevel.org/cats-effect/
[fs2]:          https://functional-streams-for-scala.github.io/fs2/
[monix]:        https://monix.io/
[doobie]:       https://tpolecat.github.io/doobie/
