package CANNON

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("cannon", "RaycastResult")
class RaycastResult() extends js.Object {
  var rayFromWorld: Vec3 = js.native
  var rayToWorld: Vec3 = js.native
  var hitNormalWorld: Vec3 = js.native
  var hitPointWorld: Vec3 = js.native
  var hasHit: Boolean = js.native
  var shape: js.Any = js.native // Shape
  var body: js.Any = js.native // Body
  var hitFaceIndex: Int = js.native
  var distance: Double = js.native
  var _shouldStop: Boolean = js.native

  def reset(): Unit = js.native
  def abort(): Unit = js.native
  def set(
      rayFromWorld: Vec3,
      rayToWorld: Vec3,
      hitNormalWorld: Vec3,
      hitPointWorld: Vec3,
      shape: js.Any,
      body: js.Any,
      distance: Double
  ): Unit = js.native
}

object RaycastResult {
  def apply(): RaycastResult = new RaycastResult()
}
