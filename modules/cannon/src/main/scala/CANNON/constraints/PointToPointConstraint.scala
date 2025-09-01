package CANNON

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("cannon", "PointToPointConstraint")
class PointToPointConstraint() extends Constraint {
  var pivotA: Vec3 = js.native
  var pivotB: Vec3 = js.native
  var equationX: js.Any = js.native // ContactEquation
  var equationY: js.Any = js.native // ContactEquation
  var equationZ: js.Any = js.native // ContactEquation

  override def update(): Unit = js.native
}

object PointToPointConstraint {
  def apply(
      bodyA: js.Any,
      pivotA: Vec3,
      bodyB: js.Any,
      pivotB: Vec3,
      maxForce: Double
  ): PointToPointConstraint = {
    val c = js.Dynamic
      .newInstance(js.Dynamic.global.cannon.PointToPointConstraint)(
        bodyA,
        pivotA,
        bodyB,
        pivotB,
        maxForce
      )
      .asInstanceOf[PointToPointConstraint]
    c
  }
  def apply(
      bodyA: js.Any,
      pivotA: Vec3,
      bodyB: js.Any,
      pivotB: Vec3
  ): PointToPointConstraint = {
    val c = js.Dynamic
      .newInstance(js.Dynamic.global.cannon.PointToPointConstraint)(
        bodyA,
        pivotA,
        bodyB,
        pivotB
      )
      .asInstanceOf[PointToPointConstraint]
    c
  }
  def apply(bodyA: js.Any, pivotA: Vec3): PointToPointConstraint = {
    val c = js.Dynamic
      .newInstance(js.Dynamic.global.cannon.PointToPointConstraint)(
        bodyA,
        pivotA
      )
      .asInstanceOf[PointToPointConstraint]
    c
  }
}
