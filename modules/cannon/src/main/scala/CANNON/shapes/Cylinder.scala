package CANNON

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("cannon", "Cylinder")
class Cylinder() extends Shape {
  var radiusTop: Double = js.native
  var radiusBottom: Double = js.native
  var height: Double = js.native
  var numSegments: Int = js.native

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

object Cylinder {
  def apply(
      radiusTop: Double,
      radiusBottom: Double,
      height: Double,
      numSegments: Int
  ): Cylinder = {
    val c = js.Dynamic
      .newInstance(js.Dynamic.global.cannon.Cylinder)(
        radiusTop,
        radiusBottom,
        height,
        numSegments
      )
      .asInstanceOf[Cylinder]
    c
  }
}
