import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("CANNON.ContactMaterial")
class ContactMaterial(m1: Material, m2: Material, options: js.Object)
    extends js.Object {
  def this(m1: Material, m2: Material) = this(m1, m2, js.Object())

  var id: Int = js.native
  var materials: js.Array[Material] = js.native
  var friction: Double = js.native
  var restitution: Double = js.native
  var contactEquationStiffness: Double = js.native
  var contactEquationRelaxation: Double = js.native
  var frictionEquationStiffness: Double = js.native
  var frictionEquationRelaxation: Double = js.native
}

object ContactMaterial {
  def apply(m1: Material, m2: Material, options: js.Object): ContactMaterial =
    new ContactMaterial(m1, m2, options)
  def apply(m1: Material, m2: Material): ContactMaterial =
    new ContactMaterial(m1, m2)
}
