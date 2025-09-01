package CANNON

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("cannon", "Body")
class Body(parameters: js.UndefOr[js.Object] = js.undefined) extends js.Object {

  var id: Int = js.native
  var world: js.Any = js.native // World
  var preStep: js.Function0[Unit] = js.native
  var postStep: js.Function0[Unit] = js.native
  var vlambda: Vec3 = js.native
  var collisionFilterGroup: Int = js.native
  var collisionFilterMask: Int = js.native
  var collisionResponse: Boolean = js.native
  var position: Vec3 = js.native
  var previousPosition: Vec3 = js.native
  var interpolatedPosition: Vec3 = js.native
  var initPosition: Vec3 = js.native
  var velocity: Vec3 = js.native
  var initVelocity: Vec3 = js.native
  var force: Vec3 = js.native
  var mass: Double = js.native
  var invMass: Double = js.native
  var material: js.Any = js.native // Material
  var linearDamping: Double = js.native
  var `type`: Int = js.native
  var allowSleep: Boolean = js.native
  var sleepState: Int = js.native
  var sleepSpeedLimit: Double = js.native
  var sleepTimeLimit: Double = js.native
  var timeLastSleepy: Double = js.native
  var torque: Vec3 = js.native
  var quaternion: Quaternion = js.native
  var initQuaternion: Quaternion = js.native
  var previousQuaternion: Quaternion = js.native
  var interpolatedQuaternion: Quaternion = js.native
  var angularVelocity: Vec3 = js.native
  var initAngularVelocity: Vec3 = js.native
  var shapes: js.Array[js.Any] = js.native // Array[Shape]
  var shapeOffsets: js.Array[Vec3] = js.native
  var shapeOrientations: js.Array[Quaternion] = js.native
  var inertia: Vec3 = js.native
  var invInertia: Vec3 = js.native
  var invInertiaWorld: Mat3 = js.native
  var invMassSolve: Double = js.native
  var invInertiaSolve: Vec3 = js.native
  var invInertiaWorldSolve: Mat3 = js.native
  var fixedRotation: Boolean = js.native
  var angularDamping: Double = js.native
  var linearFactor: Vec3 = js.native
  var angularFactor: Vec3 = js.native
  var aabb: AABB = js.native
  var aabbNeedsUpdate: Boolean = js.native
  var boundingRadius: Double = js.native
  var wlambda: Vec3 = js.native
  var _wakeUpAfterNarrowphase: Boolean = js.native

  def wakeUp(): Unit = js.native
  def sleep(): Unit = js.native
  def sleepTick(time: Double): Unit = js.native
  def updateSolveMassProperties(): Unit = js.native
  def pointToLocalFrame(worldPoint: Vec3, result: Vec3): Vec3 = js.native
  def vectorToLocalFrame(worldVector: Vec3, result: Vec3): Vec3 = js.native
  def pointToWorldFrame(localPoint: Vec3, result: Vec3): Vec3 = js.native
  def vectorToWorldFrame(localVector: Vec3, result: Vec3): Vec3 = js.native
  def addShape(shape: js.Any, offset: Vec3, orientation: Quaternion): Body =
    js.native
  def addShape(shape: js.Any, offset: Vec3): Body = js.native
  def addShape(shape: js.Any): Body = js.native
  def updateBoundingRadius(): Unit = js.native
  def computeAABB(): Unit = js.native
  def updateInertiaWorld(force: Boolean): Unit = js.native
  def updateInertiaWorld(): Unit = js.native
  def applyForce(force: Vec3, relativePoint: Vec3): Unit = js.native
  def applyLocalForce(localForce: Vec3, localPoint: Vec3): Unit = js.native
  def applyImpulse(impulse: Vec3, relativePoint: Vec3): Unit = js.native
  def applyLocalImpulse(localImpulse: Vec3, localPoint: Vec3): Unit = js.native
  def updateMassProperties(): Unit = js.native
  def getVelocityAtWorldPoint(worldPoint: Vec3, result: Vec3): Vec3 = js.native
  def integrate(
      dt: Double,
      quatNormalize: Boolean,
      quatNormalizeFast: Boolean
  ): Unit = js.native
}

object Body {
  val DYNAMIC: Int = 1
  val STATIC: Int = 2
  val KINEMATIC: Int = 4
  val AWAKE: Int = 0
  val SLEEPY: Int = 1
  val SLEEPING: Int = 2

  def apply(options: js.Object): Body = {
    new Body(options)
  }
  def apply(): Body = {
    val b = js.Dynamic
      .newInstance(js.Dynamic.global.cannon.Body)(js.Object())
      .asInstanceOf[Body]
    b
  }
}
