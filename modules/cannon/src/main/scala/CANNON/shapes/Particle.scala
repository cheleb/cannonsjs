package CANNON

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("cannon", "Particle")
class Particle() extends Shape {
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

object Particle {
  def apply(): Particle = new Particle()
}
