package CANNON

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("cannon", "EventTarget")
class EventTarget() extends js.Object {
  var _listeners: js.Object = js.native

  def addEventListener(
      eventType: String,
      listener: js.Function1[js.Object, Unit]
  ): EventTarget = js.native
  def hasEventListener(
      eventType: String,
      listener: js.Function1[js.Object, Unit]
  ): Boolean = js.native
  def hasAnyEventListener(eventType: String): Boolean = js.native
  def removeEventListener(
      eventType: String,
      listener: js.Function1[js.Object, Unit]
  ): EventTarget = js.native
  def dispatchEvent(event: js.Object): EventTarget = js.native
}

object EventTarget {
  def apply(): EventTarget = {
    val et = js.Dynamic
      .newInstance(js.Dynamic.global.cannon.EventTarget)()
      .asInstanceOf[EventTarget]
    et
  }
}
