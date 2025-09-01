package CANNON

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("cannon", "HingeConstraint")
class HingeConstraint() extends PointToPointConstraint {
  var axisA: Vec3 = js.native
  var axisB: Vec3 = js.native
  var rotationalEquation1: js.Any = js.native // RotationalEquation
  var rotationalEquation2: js.Any = js.native // RotationalEquation
  var motorEquation: js.Any = js.native // RotationalMotorEquation

  def enableMotor(): Unit = js.native
  def disableMotor(): Unit = js.native
  def setMotorSpeed(speed: Double): Unit = js.native
  def setMotorMaxForce(maxForce: Double): Unit = js.native

  override def update(): Unit = js.native
}

object HingeConstraint {
  def apply(
      bodyA: js.Any,
      bodyB: js.Any,
      options: js.Object
  ): HingeConstraint = {
    val c = js.Dynamic
      .newInstance(js.Dynamic.global.cannon.HingeConstraint)(
        bodyA,
        bodyB,
        options
      )
      .asInstanceOf[HingeConstraint]
    c
  }
  def apply(bodyA: js.Any, bodyB: js.Any): HingeConstraint = {
    val c = js.Dynamic
      .newInstance(js.Dynamic.global.cannon.HingeConstraint)(bodyA, bodyB)
      .asInstanceOf[HingeConstraint]
    c
  }
}
