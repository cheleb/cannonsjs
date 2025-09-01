package CANNON

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("cannon", "LockConstraint")
class LockConstraint() extends PointToPointConstraint {
  var xA: Vec3 = js.native
  var xB: Vec3 = js.native
  var yA: Vec3 = js.native
  var yB: Vec3 = js.native
  var zA: Vec3 = js.native
  var zB: Vec3 = js.native
  var rotationalEquation1: js.Any = js.native // RotationalEquation
  var rotationalEquation2: js.Any = js.native // RotationalEquation
  var rotationalEquation3: js.Any = js.native // RotationalEquation

  override def update(): Unit = js.native
}

object LockConstraint {
  def apply(
      bodyA: js.Any,
      bodyB: js.Any,
      options: js.Object
  ): LockConstraint = {
    val c = js.Dynamic
      .newInstance(js.Dynamic.global.cannon.LockConstraint)(
        bodyA,
        bodyB,
        options
      )
      .asInstanceOf[LockConstraint]
    c
  }
  def apply(bodyA: js.Any, bodyB: js.Any): LockConstraint = {
    val c = js.Dynamic
      .newInstance(js.Dynamic.global.cannon.LockConstraint)(bodyA, bodyB)
      .asInstanceOf[LockConstraint]
    c
  }
}
