package CANNON

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("cannon", "GSSolver")
class GSSolver() extends Solver {
  var iterations: Int = js.native
  var tolerance: Double = js.native

  override def solve(dt: Double, world: js.Any): Int = js.native
}

object GSSolver {
  def apply(): GSSolver = new GSSolver()
}
