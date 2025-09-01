import org.scalajs.linker.interface.ModuleSplitStyle

import Dependencies._
import DeploymentSettings._

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.7.2"

val usedScalacOptions = Seq(
  "-encoding",
  "utf8",
  "-unchecked",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-Xmax-inlines:64",
  "-Wunused:all"
)

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

//
// Client project
// It depends on sharedJs project, a project that contains shared code between server and client.
//
lazy val client = scalajsExampleProject("client")
  .settings(
    scalaJSUseMainModuleInitializer := true,
    scalaJSLinkerConfig ~= { config =>
      mode match {
        case "ESModule" =>
          config
            .withModuleKind(ModuleKind.ESModule)

        case _ =>
          config
            .withModuleKind(ModuleKind.ESModule)
            .withSourceMap(false)
            .withModuleSplitStyle(
              ModuleSplitStyle.SmallModulesFor(List("dev.cheleb.scalajswebgl"))
            )
      }
    }
  )
  .settings(scalacOptions ++= usedScalacOptions)
  .settings(clientLibraryDependencies)
  .dependsOn(cannonsjs)
  .settings(
    publish / skip := true
  )

def scalajsExampleProject(projectId: String): Project =
  Project(
    id = projectId,
    base = file(s"example/$projectId")
  )
    .enablePlugins(scalaJSPlugin)
    .settings(nexusNpmSettings)
    .settings(Test / requireJsDomEnv := true)
    .settings(
      scalacOptions := Seq(
        "-scalajs",
        "-deprecation",
        "-feature",
        "-Xfatal-warnings"
      )
    )
    .settings(
      publish / skip := true
    )

def nexusNpmSettings =
  sys.env
    .get("NEXUS")
    .map(url =>
      npmExtraArgs ++= Seq(
        s"--registry=$url/repository/npm-public/"
      )
    )
    .toSeq
