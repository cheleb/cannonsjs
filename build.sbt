ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.7.2"

lazy val cannonsjs = (project in file("modules/cannon"))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "cannonsjs",
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "2.8.0",
      "org.scalatest" %%% "scalatest" % "3.2.15" % Test
    )
  )
