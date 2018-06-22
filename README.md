# Scala Skeleton App

This is a [Giter8][g8] skeleton for [Scala][scala].

## Getting Started

Download an install [SBT][sbt] and run it on the command line to create a new [Scala][scala] project using the skeleton:

```
$ sbt new massung/scala-skeleton.g8
```

It has a few things to make life a little easier:

* `.editorconfig` file for indentation
* `.gitignore` for obvious reasons

In the `build.sbt` file I arbitrarily chose some common libraries I use quite frequently for the skeleton:

* [typesafe logger][logger] and [logback-classic][logback] for SLF4J logging
* [typesafe config][config] for parsing `application.properties`
* [scallop][scallop] for command line parsing
* [cats][cats] and [cats-effect][effect] for monads, fibers, etc.
* [json4s][json4s] for encoding and decoding of JSON
* [fs2][fs2] for streaming

It's also pre-setup for [Ensime][ensime], assuming you use it.

It has default `application.properties` and `logback.xml` resource files that are used. And for the skeleton code, there are only two files:

* `Main.scala` is the entry point that runs a simple `IO` program.
* `Opts.scala` handles a simple command line parsing example.

It also is setup with the `Opts` class able to load (and parse) a JSON configuration file as a command line argument. This is there for applications that need project settings that should not be stored in the `application.properties` file (e.g. API keys and database passwords).

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
