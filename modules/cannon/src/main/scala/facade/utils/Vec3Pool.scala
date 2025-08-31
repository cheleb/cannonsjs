import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("CANNON.Vec3Pool")
class Vec3Pool() extends Pool {
  override def constructObject(): Vec3 = js.native
}

object Vec3Pool {
  def apply(): Vec3Pool = {
    val vp = js.Dynamic
      .newInstance(js.Dynamic.global.CANNON.Vec3Pool)()
      .asInstanceOf[Vec3Pool]
    vp
  }
}
