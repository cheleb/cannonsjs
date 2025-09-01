package CANNON

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("cannon", "ConeTwistConstraint")
class ConeTwistConstraint() extends PointToPointConstraint {
  var axisA: Vec3 = js.native
  var axisB: Vec3 = js.native
  var angle: Double = js.native
  var coneEquation: js.Any = js.native // ConeEquation
  var twistEquation: js.Any = js.native // RotationalEquation
  var twistAngle: Double = js.native

  override def update(): Unit = js.native
}

object ConeTwistConstraint {
  def apply(
      bodyA: js.Any,
      bodyB: js.Any,
      options: js.Object
  ): ConeTwistConstraint = {
    val c = js.Dynamic
      .newInstance(js.Dynamic.global.cannon.ConeTwistConstraint)(
        bodyA,
        bodyB,
        options
      )
      .asInstanceOf[ConeTwistConstraint]
    c
  }
  def apply(bodyA: js.Any, bodyB: js.Any): ConeTwistConstraint = {
    val c = js.Dynamic
      .newInstance(js.Dynamic.global.cannon.ConeTwistConstraint)(bodyA, bodyB)
      .asInstanceOf[ConeTwistConstraint]
    c
  }
}
