import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("CANNON.Ray")
class Ray() extends js.Object {
  var from: Vec3 = js.native
  var to: Vec3 = js.native
  var _direction: Vec3 = js.native
  var precision: Double = js.native
  var checkCollisionResponse: Boolean = js.native
  var skipBackfaces: Boolean = js.native
  var collisionFilterMask: Int = js.native
  var collisionFilterGroup: Int = js.native
  var mode: Int = js.native
  var result: RaycastResult = js.native
  var hasHit: Boolean = js.native
  var callback: js.Function1[RaycastResult, Unit] = js.native

  def intersectWorld(world: js.Any, options: js.Object): Boolean = js.native
  def intersectBody(body: js.Any, result: RaycastResult): Unit = js.native
  def intersectBody(body: js.Any): Unit = js.native
  def intersectBodies(bodies: js.Array[js.Any], result: RaycastResult): Unit =
    js.native
  def intersectBodies(bodies: js.Array[js.Any]): Unit = js.native
  def _updateDirection(): Unit = js.native
  def intersectShape(
      shape: js.Any,
      quat: Quaternion,
      position: Vec3,
      body: js.Any
  ): Unit = js.native
  def getAABB(result: AABB): Unit = js.native
  def reportIntersection(
      normal: Vec3,
      hitPointWorld: Vec3,
      shape: js.Any,
      body: js.Any,
      hitFaceIndex: Int
  ): Unit = js.native
}

object Ray {
  val CLOSEST: Int = 1
  val ANY: Int = 2
  val ALL: Int = 4

  def apply(from: Vec3, to: Vec3): Ray = {
    val r = new Ray()
    r.from = from
    r.to = to
    r
  }
  def apply(from: Vec3): Ray = {
    val r = new Ray()
    r.from = from
    r
  }
  def apply(): Ray = new Ray()
}
