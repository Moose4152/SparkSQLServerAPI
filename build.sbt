name := "SparkApi_SampleDataTest"

version := "0.1"

scalaVersion := "2.13.10"

libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.7.30"
libraryDependencies += "org.apache.thrift" % "libthrift" % "0.17.0"
// https://mvnrepository.com/artifact/org.apache.spark/spark-core
libraryDependencies += "org.apache.spark" %% "spark-core" % "3.3.1"
// https://mvnrepository.com/artifact/org.apache.spark/spark-sql
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.3.1"
