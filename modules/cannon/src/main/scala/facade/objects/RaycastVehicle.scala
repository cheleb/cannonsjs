import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("CANNON.RaycastVehicle")
class RaycastVehicle() extends js.Object {

  var chassisBody: Body = js.native
  var wheelInfos: js.Array[WheelInfo] = js.native
  var sliding: Boolean = js.native
  var world: World = js.native
  var indexRightAxis: Int = js.native
  var indexForwardAxis: Int = js.native
  var indexUpAxis: Int = js.native
  var currentVehicleSpeedKmHour: Double = js.native

  def addWheel(options: js.Object): Int = js.native
  def setSteeringValue(value: Double, wheelIndex: Int): Unit = js.native
  def applyEngineForce(value: Double, wheelIndex: Int): Unit = js.native
  def setBrake(brake: Double, wheelIndex: Int): Unit = js.native
  def addToWorld(world: World): Unit = js.native
  def removeFromWorld(world: World): Unit = js.native
  def updateVehicle(timeStep: Double): Unit = js.native
  def getWheelTransformWorld(wheelIndex: Int): Transform = js.native
}

object RaycastVehicle {
  def apply(options: js.Object): RaycastVehicle = {
    val v = js.Dynamic
      .newInstance(js.Dynamic.global.CANNON.RaycastVehicle)(options)
      .asInstanceOf[RaycastVehicle]
    v
  }
}
