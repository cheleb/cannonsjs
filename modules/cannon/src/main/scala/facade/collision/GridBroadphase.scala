import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("CANNON.GridBroadphase")
class GridBroadphase(options: js.Object) extends Broadphase {
  def this() = this(js.Object())

  var nx: Int = js.native
  var ny: Int = js.native
  var nz: Int = js.native
  var aabbMin: Vec3 = js.native
  var aabbMax: Vec3 = js.native
  var bins: js.Array[js.Array[js.Any]] = js.native
}

object GridBroadphase {
  def apply(options: js.Object): GridBroadphase = new GridBroadphase(options)
  def apply(): GridBroadphase = new GridBroadphase()
}
