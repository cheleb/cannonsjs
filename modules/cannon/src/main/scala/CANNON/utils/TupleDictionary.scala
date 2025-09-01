package CANNON

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("cannon", "TupleDictionary")
class TupleDictionary() extends js.Object {
  var data: js.Object = js.native

  def get(i: Int, j: Int): js.Object = js.native
  def set(i: Int, j: Int, value: js.Object): Unit = js.native
  def reset(): Unit = js.native
}

object TupleDictionary {
  def apply(): TupleDictionary = {
    val td = js.Dynamic
      .newInstance(js.Dynamic.global.cannon.TupleDictionary)()
      .asInstanceOf[TupleDictionary]
    td
  }
}
