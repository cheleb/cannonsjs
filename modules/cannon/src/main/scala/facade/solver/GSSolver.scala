import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("CANNON.GSSolver")
class GSSolver() extends Solver {
  var iterations: Int = js.native
  var tolerance: Double = js.native

  override def solve(dt: Double, world: js.Any): Int = js.native
}

object GSSolver {
  def apply(): GSSolver = new GSSolver()
}
