name := "playframework-core"
version := "0.3"
organization := "justa.com.vc"
maintainer := "it@justa.com.vc"

scalacOptions ++= Seq("-feature")
javacOptions in compile ++= Seq("-Xlint:deprecation")
publishArtifact in (Compile, packageDoc) := false

lazy val core = (project in file("."))
  .enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  javaWs,
  ehcache,
  cacheApi,
  filters,
  guice,
  "org.mindrot" % "jbcrypt" % "0.4",
  "com.auth0" % "java-jwt" % "3.3.0"
)

// Bintray Configuration
bintrayOrganization := Some("justa")
licenses += ("Apache-2.0", url("https://opensource.org/licenses/Apache-2.0"))