import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("CANNON.Mat3")
class Mat3() extends js.Object {
  var elements: js.Array[Double] = js.native
  def identity(): Unit = js.native
  def setZero(): Unit = js.native
  def setTrace(vec3: Vec3): Unit = js.native
  def getTrace(target: Vec3): Vec3 = js.native
  def vmult(v: Vec3): Vec3 = js.native
  def vmult(v: Vec3, target: Vec3): Vec3 = js.native
  def smult(s: Double): Unit = js.native
  def mmult(m: Mat3): Mat3 = js.native
  def mmult(m: Mat3, target: Mat3): Mat3 = js.native
  def scale(v: Vec3): Mat3 = js.native
  def scale(v: Vec3, target: Mat3): Mat3 = js.native
  def solve(b: Vec3): Vec3 = js.native
  def solve(b: Vec3, target: Vec3): Vec3 = js.native
  def e(row: Int, column: Int): Double = js.native
  def e(row: Int, column: Int, value: Double): Unit = js.native
  def copy(source: Mat3): Mat3 = js.native
  override def toString(): String = js.native
  def reverse(): Mat3 = js.native
  def reverse(target: Mat3): Mat3 = js.native
  def setRotationFromQuaternion(q: Quaternion): Mat3 = js.native
  def transpose(): Mat3 = js.native
  def transpose(target: Mat3): Mat3 = js.native
}

object Mat3 {
  def apply(): Mat3 = new Mat3()
  def apply(elements: js.Array[Double]): Mat3 = {
    val m = new Mat3()
    m.elements = elements
    m
  }
}
