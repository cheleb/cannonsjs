import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("CANNON.NaiveBroadphase")
class NaiveBroadphase() extends Broadphase

object NaiveBroadphase {
  def apply(): NaiveBroadphase = new NaiveBroadphase()
}
