import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("CANNON.Solver")
class Solver() extends js.Object {
  var equations: js.Array[js.Any] = js.native

  def solve(dt: Double, world: js.Any): Int = js.native
  def addEquation(eq: js.Any): Unit = js.native
  def removeEquation(eq: js.Any): Unit = js.native
  def removeAllEquations(): Unit = js.native
}

object Solver {
  def apply(): Solver = new Solver()
}
