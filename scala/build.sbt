organization := "com.mattwittmann"

name := "roman-numeral-code-kata-scala"

version := "1.0.0"

scalaVersion := "2.11.7"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "2.2.6" % Test)
