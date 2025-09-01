package CANNON

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("cannon", "NaiveBroadphase")
class NaiveBroadphase() extends Broadphase

object NaiveBroadphase {
  def apply(): NaiveBroadphase = new NaiveBroadphase()
}
