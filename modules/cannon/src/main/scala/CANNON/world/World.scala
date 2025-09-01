package CANNON

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("cannon", "World")
class World(parameters: js.UndefOr[js.Object] = js.undefined)
    extends js.Object {

  var dt: Double = js.native
  var allowSleep: Boolean = js.native
  var contacts: js.Array[js.Any] = js.native
  var frictionEquations: js.Array[js.Any] = js.native
  var quatNormalizeSkip: Double = js.native
  var quatNormalizeFast: Boolean = js.native
  var time: Double = js.native
  var stepnumber: Double = js.native
  var gravity: Vec3 = js.native
  var broadphase: js.Any = js.native // Broadphase
  var bodies: js.Array[Body] = js.native
  var solver: js.Any = js.native // Solver
  var constraints: js.Array[js.Any] = js.native // Array[Constraint]
  var narrowphase: js.Any = js.native // Narrowphase
  var collisionMatrix: js.Any = js.native // ArrayCollisionMatrix
  var collisionMatrixPrevious: js.Any = js.native // ArrayCollisionMatrix
  var bodyOverlapKeeper: js.Any = js.native // OverlapKeeper
  var shapeOverlapKeeper: js.Any = js.native // OverlapKeeper
  var materials: js.Array[js.Any] = js.native // Array[Material]
  var contactmaterials: js.Array[js.Any] = js.native // Array[ContactMaterial]
  var contactMaterialTable: js.Any = js.native // TupleDictionary
  var defaultMaterial: js.Any = js.native // Material
  var defaultContactMaterial: js.Any = js.native // ContactMaterial
  var doProfiling: Boolean = js.native
  var profile: js.Object = js.native
  var accumulator: Double = js.native
  var subsystems: js.Array[js.Any] = js.native
  var idToBodyMap: js.Object = js.native

  def getContactMaterial(m1: js.Any, m2: js.Any): js.Any = js.native
  def numObjects(): Double = js.native
  def collisionMatrixTick(): Unit = js.native
  def add(options: js.Object): Body = js.native
  def addBody(body: Body): Body = js.native
  def addConstraint(c: js.Any): Unit = js.native
  def removeConstraint(c: js.Any): Unit = js.native
  def rayTest(from: Vec3, to: Vec3, result: js.Any): Unit = js.native
  def raycastAll(
      from: Vec3,
      to: Vec3,
      options: js.Object,
      callback: js.Function1[js.Any, Unit]
  ): Boolean = js.native
  def raycastAny(
      from: Vec3,
      to: Vec3,
      options: js.Object,
      result: js.Any
  ): Boolean = js.native
  def raycastClosest(
      from: Vec3,
      to: Vec3,
      options: js.Object,
      result: js.Any
  ): Boolean = js.native
  def remove(body: Body): Unit = js.native
  def removeBody(body: Body): Unit = js.native
  def getBodyById(id: Int): Body = js.native
  def getShapeById(id: Int): js.Any = js.native
  def addMaterial(m: js.Any): Unit = js.native
  def addContactMaterial(cmat: js.Any): Unit = js.native
  def step(dt: Double, timeSinceLastCalled: Double, maxSubSteps: Double): Unit =
    js.native
  def step(dt: Double, timeSinceLastCalled: Double): Unit = js.native
  def step(dt: Double): Unit = js.native
  def emitContactEvents(): Unit = js.native
  def clearForces(): Unit = js.native
}

object World {
  def apply(options: js.Object): World = {
    new World(options)
  }
  def apply(): World = {
    new World()
  }
}
