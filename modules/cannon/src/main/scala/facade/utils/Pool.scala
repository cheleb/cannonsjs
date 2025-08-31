import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("CANNON.Pool")
class Pool() extends js.Object {
  var objects: js.Array[js.Object] = js.native
  var `type`: js.Object = js.native

  def release(objects: js.Object*): Pool = js.native
  def get(): js.Object = js.native
  def constructObject(): js.Object = js.native
  def resize(size: Int): Pool = js.native
}

object Pool {
  def apply(): Pool = {
    val p =
      js.Dynamic.newInstance(js.Dynamic.global.CANNON.Pool)().asInstanceOf[Pool]
    p
  }
}
