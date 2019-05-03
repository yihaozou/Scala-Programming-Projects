name := "advanced-features"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"
libraryDependencies += "org.typelevel" %% "cats-core" % "1.1.0"
libraryDependencies += "org.typelevel" %% "cats-laws" % "1.1.0"
scalacOptions += "-Ypartial-unification"
