import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("CANNON.Heightfield")
class Heightfield() extends Shape {
  var data: js.Array[js.Array[Double]] = js.native
  var maxValue: Double = js.native
  var minValue: Double = js.native
  var elementSize: Double = js.native
  var cacheEnabled: Boolean = js.native
  var pillarConvex: js.Array[js.Any] = js.native
  var pillarOffset: Vec3 = js.native

  def getRectMinMax(
      iMinX: Int,
      iMinY: Int,
      iMaxX: Int,
      iMaxY: Int,
      result: js.Array[Double]
  ): Unit = js.native
  def getIndexOfPosition(
      x: Double,
      y: Double,
      result: js.Array[Int],
      clamp: Boolean
  ): Boolean = js.native
  def getTriangleAt(x: Double, y: Double, edgeClamp: Boolean): js.Array[Int] =
    js.native
  def getNormalAt(x: Double, y: Double, edgeClamp: Boolean): Vec3 = js.native
  def getAabbAtCell(i: Int, j: Int, result: js.Array[Vec3]): Unit = js.native
  def getHeightAt(x: Double, y: Double, edgeClamp: Boolean): Double = js.native
  override def calculateLocalInertia(mass: Double, target: Vec3): Vec3 =
    js.native
  override def volume(): Double = js.native
  override def updateBoundingSphereRadius(): Unit = js.native
  def calculateWorldAABB(
      pos: Vec3,
      quat: Quaternion,
      min: Vec3,
      max: Vec3
  ): Unit = js.native
}

object Heightfield {
  def apply(
      data: js.Array[js.Array[Double]],
      options: js.Object
  ): Heightfield = {
    val h = js.Dynamic
      .newInstance(js.Dynamic.global.CANNON.Heightfield)(data, options)
      .asInstanceOf[Heightfield]
    h
  }
}
