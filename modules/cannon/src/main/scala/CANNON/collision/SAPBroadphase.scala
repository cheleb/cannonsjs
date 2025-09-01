package CANNON

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("cannon", "SAPBroadphase")
class SAPBroadphase() extends Broadphase {
  var axisList: js.Array[js.Any] = js.native
  var axisIndex: Int = js.native
}

object SAPBroadphase {
  def apply(): SAPBroadphase = new SAPBroadphase()
}
