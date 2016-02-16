name := """simple-mini-akka-scala-seed"""

version := "0.1"

scalaVersion := "2.11.7"


libraryDependencies ++= {
  val akkaVersion = "2.4.1"
  val sprayVersion = "1.3.3"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    //"com.typesafe.akka" %% "akka-remote" % akkaVersion,
    //"com.typesafe.akka" %% "akka-multi-node-testkit" % akkaVersion,
    //"com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
    //"ch.qos.logback" % "logback-classic" % "1.1.3",
    //"io.spray" %% "spray-can" % sprayVersion,
    //"io.spray" %% "spray-routing" % sprayVersion,
    //"io.spray" %% "spray-json" % "1.3.2",
    "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test",
    "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
  )
}