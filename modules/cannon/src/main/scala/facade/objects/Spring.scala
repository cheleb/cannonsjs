import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("CANNON.Spring")
class Spring() extends js.Object {
  var restLength: Double = js.native
  var stiffness: Double = js.native
  var damping: Double = js.native
  var bodyA: Body = js.native
  var bodyB: Body = js.native
  var localAnchorA: Vec3 = js.native
  var localAnchorB: Vec3 = js.native

  def setWorldAnchorA(worldAnchorA: Vec3): Unit = js.native
  def setWorldAnchorB(worldAnchorB: Vec3): Unit = js.native
  def getWorldAnchorA(result: Vec3): Unit = js.native
  def getWorldAnchorB(result: Vec3): Unit = js.native
  def applyForce(): Unit = js.native
}

object Spring {
  def apply(bodyA: Body, bodyB: Body, options: js.Object): Spring = {
    val s = js.Dynamic
      .newInstance(js.Dynamic.global.CANNON.Spring)(bodyA, bodyB, options)
      .asInstanceOf[Spring]
    s
  }
  def apply(bodyA: Body, bodyB: Body): Spring = {
    val s = js.Dynamic
      .newInstance(js.Dynamic.global.CANNON.Spring)(bodyA, bodyB, js.Object())
      .asInstanceOf[Spring]
    s
  }
}
