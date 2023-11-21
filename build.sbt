val scala3Version = "2.13.11"

resolvers += Resolver.JCenterRepository

lazy val root = project
  .in(file("."))
  .settings(
    name := "melbot-discord",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "net.katsstuff" %% "ackcord" % "2.0.0.0-M1", // For high level API, includes all the other modules
      "net.katsstuff" %% "ackcord-interactions" % "2.0.0.0-M1", // For high level API, includes all the other modules
      "org.scalameta" %% "munit" % "0.7.29" % Test
    )
  )
