name := "akka-mon"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4-SNAPSHOT",
  "org.scala-lang" % "scala-reflect" % "2.11.6")


resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"