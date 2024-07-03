val ScalatraVersion = "3.1.0"

ThisBuild / scalaVersion := "2.13.14"
ThisBuild / organization := "com.example"

lazy val hello = (project in file("."))
  .settings(
    name := "My Scalatra Web App",
    version := "0.1.0-SNAPSHOT",
    libraryDependencies ++= Seq(
      "org.scalatra" %% "scalatra-jakarta" % ScalatraVersion,
      "org.scalatra" %% "scalatra-scalatest-jakarta" % ScalatraVersion % "test",
      "ch.qos.logback" % "logback-classic" % "1.5.6" % "runtime",
      "org.eclipse.jetty.ee10" % "jetty-ee10-webapp" % "12.0.10" % "container",
      "jakarta.servlet" % "jakarta.servlet-api" % "6.0.0" % "provided",
      "com.typesafe" % "config" % "1.4.1"
    ),
  )

enablePlugins(SbtTwirl)
enablePlugins(JettyPlugin)

Jetty / containerLibs := Seq("org.eclipse.jetty.ee10" % "jetty-ee10-runner" % "12.0.10" intransitive())
Jetty / containerMain := "org.eclipse.jetty.ee10.runner.Runner"
