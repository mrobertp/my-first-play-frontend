name := """my-first-frontend"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(resolvers ++= Seq(
    Resolver.bintrayRepo("hmrc", "releases"),
    Resolver.jcenterRepo
  ))

scalaVersion := "2.11.12"

libraryDependencies += guice
libraryDependencies += "uk.gov.hmrc" %% "govuk-template" % "5.57.0-play-26"
libraryDependencies += "uk.gov.hmrc" %% "bootstrap-play-26" % "1.7.0"
libraryDependencies += "uk.gov.hmrc" %% "play-ui" % "8.13.0-play-26"
libraryDependencies += "uk.gov.hmrc" %% "hmrctest" % "3.9.0-play-26" % Test
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
