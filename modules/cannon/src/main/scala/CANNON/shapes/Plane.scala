package CANNON

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("cannon", "Plane")
class Plane() extends Shape {
  var worldNormal: Vec3 = js.native
  var worldNormalNeedsUpdate: Boolean = js.native

  def computeWorldNormal(quat: Quaternion): Unit = js.native
  override def calculateLocalInertia(mass: Double, target: Vec3): Vec3 =
    js.native
  override def volume(): Double = js.native
  def calculateWorldAABB(
      pos: Vec3,
      quat: Quaternion,
      min: Vec3,
      max: Vec3
  ): Unit = js.native
  override def updateBoundingSphereRadius(): Unit = js.native
}

object Plane {
  def apply(): Plane = new Plane()
}
