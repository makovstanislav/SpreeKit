val scala3Version = "3.1.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "alpha",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,
    libraryDependencies += "com.lihaoyi" %% "requests" % "0.7.0",
    libraryDependencies += "com.lihaoyi" %% "upickle" % "1.6.0"
  )
