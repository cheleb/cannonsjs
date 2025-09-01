package CANNON

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("cannon", "Shape")
class Shape(options: js.Object) extends js.Object {
  def this() = this(js.Object())

  var id: Int = js.native
  var `type`: Int = js.native
  var boundingSphereRadius: Double = js.native
  var collisionResponse: Boolean = js.native
  var collisionFilterGroup: Int = js.native
  var collisionFilterMask: Int = js.native
  var material: js.Any = js.native // Material
  var body: js.Any = js.native // Body

  def updateBoundingSphereRadius(): Unit = js.native
  def volume(): Double = js.native
  def calculateLocalInertia(mass: Double, target: Vec3): Vec3 = js.native
}

object Shape {
  @js.native
  @JSImport("cannon", "Shape")
  object ShapeJS extends js.Object {
    val types: ShapeTypes = js.native
  }

  def apply(): Shape = new Shape()
  def apply(options: js.Object): Shape = new Shape(options)
}

@js.native
trait ShapeTypes extends js.Object {
  val SPHERE: Int = js.native
  val PLANE: Int = js.native
  val BOX: Int = js.native
  val COMPOUND: Int = js.native
  val CONVEXPOLYHEDRON: Int = js.native
  val HEIGHTFIELD: Int = js.native
  val PARTICLE: Int = js.native
  val CYLINDER: Int = js.native
  val TRIMESH: Int = js.native
}
