# Scala Skeleton App

This is a [Giter8][g8] skeleton for [Scala][scala]. While [SBT][sbt] is used to instantiate the skeleton, the skeleton is actually made for use with [Mill][mill].

## Getting Started

Download an install [SBT][sbt] and run it on the command line to create a new [Scala][scala] project using the skeleton:

```
$ sbt new massung/scala-mill-skeleton.g8
```

The template parameters are as follows:

* `name` is the name of the path the skeleton will instantiate to;
* `artifact` is the artifact id of the package;
* `group` is the group id of the package;
* `version` is the initial version of the package;
* `license` is the default license;
* `scala_version` is the version of Scala to use;

Once instantiated, you'll need to download [Mill][mill] to compile/run it (replace `$artifact$` with the artifact name you gave your application):

```
$ mill $artifact$.compile
```

## Skeleton

The skeleton has a few things to make life a little easier:

* `.editorconfig` file for indentation
* `.gitignore` for obvious reasons

In the `build.sc` file I arbitrarily chose some common libraries I use quite frequently for the skeleton:

* [typesafe logger][logger] and [logback-classic][logback] for SLF4J logging
* [typesafe config][config] for parsing `application.properties`
* [scallop][scallop] for command line parsing
* [cats][cats] and [cats-effect][effect] for monads, fibers, etc.
* [json4s][json4s] for encoding and decoding of JSON

It has default `application.properties` and `logback.xml` resource files that are used. And for the skeleton code, there are only three files:

* `Main.scala` is the entry point that runs a simple `IO` program.
* `Config.scala` has basic reading/writing of a JSON configuration file.
* `Opts.scala` handles a simple command line parsing example.

The default `Opts` implementation has the (optional, lazy) ability to load and parse a `Config` from disk on startup. This is there for applications that need project settings that should not be stored in the `application.properties` file: API keys, passwords, user settings, etc.

# fin.

[g8]:           http://www.foundweekends.org/giter8
[sbt]:          https://www.scala-sbt.org/index.html
[scala]:        http://www.scala.org
[mill]:         http://www.lihaoyi.com/mill/
[logback]:      https://logback.qos.ch/
[logger]:       https://github.com/lightbend/scala-logging
[config]:       https://lightbend.github.io/config/
[scallop]:      https://github.com/scallop/scallop
[json4s]:       http://json4s.org/
[cats]:         https://typelevel.org/cats/
[effect]:       https://typelevel.org/cats-effect/
[fs2]:          https://functional-streams-for-scala.github.io/fs2/
[monix]:        https://monix.io/
