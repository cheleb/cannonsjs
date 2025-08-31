import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("CANNON.SplitSolver")
class SplitSolver() extends Solver {
  var iterations: Int = js.native
  var tolerance: Double = js.native
  var subsolver: Solver = js.native
  var nodes: js.Array[js.Any] = js.native
  var nodePool: js.Array[js.Any] = js.native

  override def solve(dt: Double, world: js.Any): Int = js.native
}

object SplitSolver {
  def apply(subsolver: Solver): SplitSolver = {
    val s = js.Dynamic
      .newInstance(js.Dynamic.global.CANNON.SplitSolver)(subsolver)
      .asInstanceOf[SplitSolver]
    s
  }
}
