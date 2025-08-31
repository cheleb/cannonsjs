import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("CANNON.Quaternion")
class Quaternion(var x: Double, var y: Double, var z: Double, var w: Double)
    extends js.Object {
  def this() = this(0.0, 0.0, 0.0, 1.0)
  def this(x: Double) = this(x, 0.0, 0.0, 1.0)
  def this(x: Double, y: Double) = this(x, y, 0.0, 1.0)
  def this(x: Double, y: Double, z: Double) = this(x, y, z, 1.0)

  def set(x: Double, y: Double, z: Double, w: Double): Quaternion = js.native
  override def toString(): String = js.native
  def toArray(): js.Array[Double] = js.native
  def setFromAxisAngle(axis: Vec3, angle: Double): Quaternion = js.native
  def toAxisAngle(targetAxis: Vec3): js.Array[Any] = js.native
  def setFromVectors(u: Vec3, v: Vec3): Quaternion = js.native
  def mult(q: Quaternion): Quaternion = js.native
  def mult(q: Quaternion, target: Quaternion): Quaternion = js.native
  def inverse(): Quaternion = js.native
  def inverse(target: Quaternion): Quaternion = js.native
  def conjugate(): Quaternion = js.native
  def conjugate(target: Quaternion): Quaternion = js.native
  def normalize(): Quaternion = js.native
  def normalizeFast(): Quaternion = js.native
  def vmult(v: Vec3): Vec3 = js.native
  def vmult(v: Vec3, target: Vec3): Vec3 = js.native
  def copy(source: Quaternion): Quaternion = js.native
  def toEuler(target: Vec3, order: String): Unit = js.native
  def toEuler(target: Vec3): Unit = js.native
  def setFromEuler(x: Double, y: Double, z: Double, order: String): Quaternion =
    js.native
  def setFromEuler(x: Double, y: Double, z: Double): Quaternion = js.native
  override def clone(): Quaternion = js.native
  def slerp(toQuat: Quaternion, t: Double, target: Quaternion): Quaternion =
    js.native
  def slerp(toQuat: Quaternion, t: Double): Quaternion = js.native
  def integrate(
      angularVelocity: Vec3,
      dt: Double,
      angularFactor: Vec3,
      target: Quaternion
  ): Quaternion = js.native
}

object Quaternion {
  def apply(): Quaternion = new Quaternion()
  def apply(x: Double, y: Double, z: Double, w: Double): Quaternion =
    new Quaternion(x, y, z, w)
}
