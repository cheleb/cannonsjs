import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("CANNON.Broadphase")
class Broadphase() extends js.Object {
  var world: js.Any = js.native // World
  var useBoundingBoxes: Boolean = js.native
  var dirty: Boolean = js.native

  def collisionPairs(
      world: js.Any,
      p1: js.Array[js.Any],
      p2: js.Array[js.Any]
  ): Unit = js.native
  def needBroadphaseCollision(bodyA: js.Any, bodyB: js.Any): Boolean = js.native
  def intersectionTest(
      bodyA: js.Any,
      bodyB: js.Any,
      pairs1: js.Array[js.Any],
      pairs2: js.Array[js.Any]
  ): Unit = js.native
  def doBoundingSphereBroadphase(
      bodyA: js.Any,
      bodyB: js.Any,
      pairs1: js.Array[js.Any],
      pairs2: js.Array[js.Any]
  ): Unit = js.native
  def doBoundingBoxBroadphase(
      bodyA: js.Any,
      bodyB: js.Any,
      pairs1: js.Array[js.Any],
      pairs2: js.Array[js.Any]
  ): Unit = js.native
  def makePairsUnique(
      pairs1: js.Array[js.Any],
      pairs2: js.Array[js.Any]
  ): Unit = js.native
  def setWorld(world: js.Any): Unit = js.native
  def aabbQuery(
      world: js.Any,
      aabb: AABB,
      result: js.Array[js.Any]
  ): js.Array[js.Any] = js.native
}

object Broadphase {
  def apply(): Broadphase = new Broadphase()
}
