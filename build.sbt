name := "functional_programming_scala"

version := "0.1"

scalaVersion := "2.12.4"

lazy val scalaTestVersion = "3.0.4"

libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % scalaTestVersion,
  "org.scalatest" %% "scalatest" % scalaTestVersion % "test",
)
