val scala3Version = "3.1.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "alpha",
    version := "0.1.0-SNAPSHOT",
    mainClass in (Compile, run) := Some("SheetsExample"),

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,
    libraryDependencies += "com.lihaoyi" %% "requests" % "0.7.0",
    libraryDependencies += "com.lihaoyi" %% "upickle" % "1.6.0",
    libraryDependencies += "com.google.api-client" % "google-api-client" % "1.35.1",
    libraryDependencies += "com.google.oauth-client" % "google-oauth-client-jetty" % "1.34.1",
    libraryDependencies += "com.google.apis" % "google-api-services-sheets" % "v4-rev20210629-1.32.1",
    libraryDependencies += "com.google.auth" % "google-auth-library-oauth2-http" % "1.7.0",
    libraryDependencies += "com.google.api-client" % "google-api-client-jackson2" % "1.20.0"
  )

