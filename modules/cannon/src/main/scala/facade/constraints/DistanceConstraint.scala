import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("CANNON.DistanceConstraint")
class DistanceConstraint() extends Constraint {
  var distance: Double = js.native
  var distanceEquation: js.Any = js.native // ContactEquation

  override def update(): Unit = js.native
}

object DistanceConstraint {
  def apply(
      bodyA: js.Any,
      bodyB: js.Any,
      distance: Double,
      maxForce: Double
  ): DistanceConstraint = {
    val c = js.Dynamic
      .newInstance(js.Dynamic.global.CANNON.DistanceConstraint)(
        bodyA,
        bodyB,
        distance,
        maxForce
      )
      .asInstanceOf[DistanceConstraint]
    c
  }
  def apply(
      bodyA: js.Any,
      bodyB: js.Any,
      distance: Double
  ): DistanceConstraint = {
    val c = js.Dynamic
      .newInstance(js.Dynamic.global.CANNON.DistanceConstraint)(
        bodyA,
        bodyB,
        distance
      )
      .asInstanceOf[DistanceConstraint]
    c
  }
  def apply(bodyA: js.Any, bodyB: js.Any): DistanceConstraint = {
    val c = js.Dynamic
      .newInstance(js.Dynamic.global.CANNON.DistanceConstraint)(bodyA, bodyB)
      .asInstanceOf[DistanceConstraint]
    c
  }
}
