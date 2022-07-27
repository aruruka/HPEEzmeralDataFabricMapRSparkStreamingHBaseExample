val sparkVersion = "3.2.0.3-eep-810"

lazy val SparkStreamingHBaseExampleNew = (project in file(".")).settings(
  inThisBuild(
    List(
      organization := "com.shouneng",
      scalaVersion := "2.12.16"
    )
  ),
  name := "SparkStreamingHBaseExampleNew",
  version := "0.0.1",
  resolvers ++= Seq(
    "mapr-releases" at "https://repository.mapr.com/nexus/content/repositories/releases"
  ),
  libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
    "org.apache.spark" %% "spark-sql" % sparkVersion % "provided",
    "org.apache.spark" %% "spark-streaming" % sparkVersion % "provided",
    "org.apache.hbase" % "hbase-server" % "1.4.13.200-eep-810" % "provided"
  )
)
