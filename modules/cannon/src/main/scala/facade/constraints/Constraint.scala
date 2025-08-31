import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("CANNON.Constraint")
class Constraint() extends js.Object {
  var equations: js.Array[js.Any] = js.native
  var bodyA: js.Any = js.native
  var bodyB: js.Any = js.native
  var id: Int = js.native
  var collideConnected: Boolean = js.native

  def update(): Unit = js.native
  def enable(): Unit = js.native
  def disable(): Unit = js.native
}

object Constraint {
  def apply(bodyA: js.Any, bodyB: js.Any, options: js.Object): Constraint = {
    val c = js.Dynamic
      .newInstance(js.Dynamic.global.CANNON.Constraint)(bodyA, bodyB, options)
      .asInstanceOf[Constraint]
    c
  }
  def apply(bodyA: js.Any, bodyB: js.Any): Constraint = {
    val c = js.Dynamic
      .newInstance(js.Dynamic.global.CANNON.Constraint)(bodyA, bodyB)
      .asInstanceOf[Constraint]
    c
  }
}
