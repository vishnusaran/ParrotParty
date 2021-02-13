import sbt.ThisBuild

ThisBuild / name := "ParrotParty"
ThisBuild / version := "0.0.1-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.3"
ThisBuild / scalacOptions ++= Seq(
  "-language:higherKinds",
  "-language:postfixOps"
)

lazy val zioVersion = "1.0.3"

libraryDependencies ++= Seq(
  "dev.zio" %% "zio" % zioVersion,
  "com.github.pathikrit" %% "better-files" % "3.9.1",
  "dev.zio" %% "zio-logging" % "0.5.4",

  "org.scalatest" %% "scalatest" % "3.2.3" % "test",
  "dev.zio" %% "zio-test" % zioVersion % "test",
  "dev.zio" %% "zio-test-sbt" % zioVersion % "test",
)
