import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("CANNON.Sphere")
class Sphere() extends Shape {
  var radius: Double = js.native

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

object Sphere {
  def apply(radius: Double): Sphere = {
    val s = new Sphere()
    s.radius = radius
    s
  }
  def apply(): Sphere = new Sphere()
}
