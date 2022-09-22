import scoverage.ScoverageKeys.coverageFailOnMinimum
import scoverage.ScoverageSbtPlugin
import scoverage.ScoverageKeys._

ThisBuild / name := "smoothcrawler-library"

ThisBuild / organization := "org.smoothcrawler"

ThisBuild / version := "0.1.0"

//ThisBuild / scalaVersion := "3.2.0"
//ThisBuild / scalaVersion := "2.13.5"
ThisBuild / scalaVersion := "2.12.13"
// The latest version of Scala at dependency 'scalac-scoverage-runtime' it supports is '2.13.5'.
// https://mvnrepository.com/artifact/org.scoverage/scalac-scoverage-runtime
// The dependency is be needed by 'org.scoverage/sbt-scoverage'.

ThisBuild / scalacOptions ++= Seq("-encoding", "UTF-8")

lazy val smoothcrawler = project
  .in(file("."))
  .enablePlugins(SbtPlugin, ScoverageSbtPlugin)
  .settings(
    name := "smoothcrawler-scala"

//    scalaVersion := "2.12.13",

//    libraryDependencies ++= {
//      Seq(
//        "org.scalatest" %% "scalatest" % "3.2.12" % Test,
//        "org.scalamock" %% "scalamock" % "5.2.0" % Test
//      )
//    },

//    coverageEnabled := true,
//    coverageFailOnMinimum := true,
//    coverageMinimum := 75,
//    coverageHighlighting := true
  )

//lazy val root = (project in file("."))
//  .settings(
//    name := "SmoothCrawler-Scala",
////    packageName := "smoothcrawler-scala",
////    packageSrc := new File("org.smoothcrawler"),
////    coverageEnabled := true,
////    coverageFailOnMinimum := true,
////    coverageMinimum := 75,
////    coverageHighlighting := true
//  )

ThisBuild / libraryDependencies ++= {
  Seq(
    "org.scalatest" %% "scalatest" % "3.2.12" % Test,
    "org.scalamock" %% "scalamock" % "5.2.0" % Test
  )
}
//    "org.junit.jupiter" % "junit-jupiter" % "5.9.0" % Test,
//    "org.assertj" % "assertj-core" % "3.23.1" % Test,
//    "org.scalatestplus" %% "mockito-3-4" % "3.2.10.0" % Test,
//    "com.novocode" % "junit-interface" % "0.11" % "test->default",
//    "org.scoverage" %% "sbt-scoverage" % "1.7.2" % Test

//testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a"))

ThisBuild / coverageEnabled := true
ThisBuild / coverageFailOnMinimum := true
ThisBuild / coverageMinimum := 75
ThisBuild / coverageHighlighting := true
//parallelExecution in Test := false
