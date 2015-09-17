name := "spec test"

version := "1.0"

scalaVersion := "2.10.5"

resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"
resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
libraryDependencies += "org.specs2"          %% "specs2-core"     % "2.4.17"

parallelExecution in Test := false
