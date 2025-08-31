import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("CANNON.RigidVehicle")
class RigidVehicle() extends js.Object {

  var wheelBodies: js.Array[Body] = js.native
  var coordinateSystem: Vec3 = js.native
  var chassisBody: Body = js.native
  var constraints: js.Array[HingeConstraint] = js.native
  var wheelAxes: js.Array[Vec3] = js.native
  var wheelForces: js.Array[Double] = js.native

  def addWheel(options: js.Object): Int = js.native
  def setSteeringValue(value: Double, wheelIndex: Int): Unit = js.native
  def setMotorSpeed(value: Double, wheelIndex: Int): Unit = js.native
  def disableMotor(wheelIndex: Int): Unit = js.native
  def setWheelForce(value: Double, wheelIndex: Int): Unit = js.native
  def applyWheelForce(value: Double, wheelIndex: Int): Unit = js.native
  def addToWorld(world: World): Unit = js.native
  def removeFromWorld(world: World): Unit = js.native
  def getWheelSpeed(wheelIndex: Int): Double = js.native
}

object RigidVehicle {
  def apply(options: js.Object): RigidVehicle = {
    val v = js.Dynamic
      .newInstance(js.Dynamic.global.CANNON.RigidVehicle)(options)
      .asInstanceOf[RigidVehicle]
    v
  }
}
