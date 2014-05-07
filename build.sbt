import sbt._
import Process._
import Keys._

name := "meteora_deliver"

version :="1.0"

scalaVersion := "2.11.0"

crossPaths := false

// webapp
seq(webSettings :_*)

// tomcat
val tomcatVersion = "7.0.53"

libraryDependencies ++= Seq(
  "org.apache.tomcat.embed" % "tomcat-embed-core"         % tomcatVersion % "container",
  "org.apache.tomcat.embed" % "tomcat-embed-logging-juli" % tomcatVersion % "container",
  "org.apache.tomcat.embed" % "tomcat-embed-jasper"       % tomcatVersion % "container",
  "org.apache.tomcat" % "tomcat-catalina" % tomcatVersion % "provided",
  "org.apache.tomcat" % "tomcat-coyote"   % tomcatVersion % "provided"
)

//dependency
libraryDependencies ++= Seq(
  "javax.servlet"          % "javax.servlet-api" % "3.0.1" % "provided",
  "org.scala-lang.modules" % "scala-xml_2.11"    % "1.0.1"
)

