import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("CANNON.SPHSystem")
class SPHSystem() extends js.Object {
  var particles: js.Array[Body] = js.native
  var density: Double = js.native
  var smoothingRadius: Double = js.native
  var speedOfSound: Double = js.native
  var viscosity: Double = js.native
  var eps: Double = js.native
  var pressures: js.Array[Double] = js.native
  var densities: js.Array[Double] = js.native
  var neighbors: js.Array[js.Array[Body]] = js.native

  def add(particle: Body): Unit = js.native
  def remove(particle: Body): Unit = js.native
  def getNeighbors(particle: Body, neighbors: js.Array[Body]): Unit = js.native
  def update(): Unit = js.native
  def w(r: Double): Double = js.native
  def gradw(rVec: Vec3, resultVec: Vec3): Unit = js.native
  def nablaw(r: Double): Double = js.native
}

object SPHSystem {
  def apply(): SPHSystem = {
    val s = js.Dynamic
      .newInstance(js.Dynamic.global.CANNON.SPHSystem)()
      .asInstanceOf[SPHSystem]
    s
  }
}
