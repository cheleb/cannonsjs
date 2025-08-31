import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("CANNON.Box")
class Box() extends Shape {
  var halfExtents: Vec3 = js.native
  var convexPolyhedronRepresentation: js.Any = js.native

  def updateConvexPolyhedronRepresentation(): Unit = js.native
  override def calculateLocalInertia(mass: Double, target: Vec3): Vec3 =
    js.native
  def getSideNormals(
      sixTargetVectors: js.Array[Vec3],
      quat: Quaternion
  ): js.Array[Vec3] = js.native
  def getSideNormals(sixTargetVectors: js.Array[Vec3]): js.Array[Vec3] =
    js.native
  override def volume(): Double = js.native
  override def updateBoundingSphereRadius(): Unit = js.native
  def forEachWorldCorner(
      pos: Vec3,
      quat: Quaternion,
      callback: js.Function3[Double, Double, Double, Unit]
  ): Unit = js.native
  def calculateWorldAABB(
      pos: Vec3,
      quat: Quaternion,
      min: Vec3,
      max: Vec3
  ): Unit = js.native
}

object Box {
  @js.native
  @JSGlobal("CANNON.Box")
  object BoxJS extends js.Object {
    def calculateInertia(halfExtents: Vec3, mass: Double, target: Vec3): Vec3 =
      js.native
  }

  def apply(halfExtents: Vec3): Box = {
    val b = new Box()
    b.halfExtents = halfExtents
    b
  }
}
