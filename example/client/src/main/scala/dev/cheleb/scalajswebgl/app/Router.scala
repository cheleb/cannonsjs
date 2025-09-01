package dev.cheleb.scalajswebgl.app

import com.raquo.laminar.api.L.*
import frontroute.*

import org.scalajs.dom
import dev.cheleb.scalajswebgl.samples.three.BallsPage

object Router:
  val uiBase = "cannonsjs"
  def uiRoute(segments: String*) = segments.mkString(s"/$uiBase/", "/", "")
  private val externalUrlBus = EventBus[String]()
  val writer = externalUrlBus.writer

  def apply() =
    mainTag(
      linkHandler,
      routes(
        div(
          styleAttr := "max-width: fit-content;  margin-left: auto;  margin-right: auto;",
          // potentially children

          pathPrefix(uiBase) {
            pathPrefix("demo") {
              firstMatch(
                path("balls") {
                  BallsPage()
                },
                pathEnd {
                  HomePage()
                }
              )
            }
          },
          noneMatched {
            div("404 Not Found")
          }
        )
      )
    )
  def linkHandler =
    onMountCallback(ctx =>
      externalUrlBus.events
        .foreach(url => dom.window.location.href = url)(using ctx.owner)
    )
