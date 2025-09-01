package CANNON

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("cannon", "Material")
class Material(options: js.Object) extends js.Object {
  def this(name: String) = this(js.Object())
  def this() = this(js.Object())

  var name: String = js.native
  var id: Int = js.native
  var friction: Double = js.native
  var restitution: Double = js.native
}

object Material {
  def apply(name: String): Material = new Material(name)
  def apply(options: js.Object): Material = new Material(options)
  def apply(): Material = new Material()
}
