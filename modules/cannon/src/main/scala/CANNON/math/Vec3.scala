package CANNON

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, JSImport}

@js.native
@JSImport("cannon", "Vec3")
class Vec3(var x: Double, var y: Double, var z: Double) extends js.Object {
  def this() = this(0.0, 0.0, 0.0)
  def this(x: Double) = this(x, 0.0, 0.0)
  def this(x: Double, y: Double) = this(x, y, 0.0)

  def set(x: Double, y: Double, z: Double): Vec3 = js.native
  def setZero(): Unit = js.native
  def vadd(v: Vec3): Vec3 = js.native
  def vadd(v: Vec3, target: Vec3): Vec3 = js.native
  def vsub(v: Vec3): Vec3 = js.native
  def vsub(v: Vec3, target: Vec3): Vec3 = js.native
  def cross(v: Vec3): Vec3 = js.native
  def cross(v: Vec3, target: Vec3): Vec3 = js.native
  def crossmat(): Mat3 = js.native
  def normalize(): Double = js.native
  def unit(): Vec3 = js.native
  def unit(target: Vec3): Vec3 = js.native
  def norm(): Double = js.native
  def length(): Double = js.native
  def norm2(): Double = js.native
  def lengthSquared(): Double = js.native
  def distanceTo(p: Vec3): Double = js.native
  def distanceSquared(p: Vec3): Double = js.native
  def mult(scalar: Double): Vec3 = js.native
  def mult(scalar: Double, target: Vec3): Vec3 = js.native
  def vmul(vector: Vec3): Vec3 = js.native
  def vmul(vector: Vec3, target: Vec3): Vec3 = js.native
  def scale(scalar: Double): Vec3 = js.native
  def scale(scalar: Double, target: Vec3): Vec3 = js.native
  def addScaledVector(scalar: Double, vector: Vec3): Vec3 = js.native
  def addScaledVector(scalar: Double, vector: Vec3, target: Vec3): Vec3 =
    js.native
  def dot(v: Vec3): Double = js.native
  def isZero(): Boolean = js.native
  def negate(): Vec3 = js.native
  def negate(target: Vec3): Vec3 = js.native
  def tangents(t1: Vec3, t2: Vec3): Unit = js.native
  override def toString(): String = js.native
  def toArray(): js.Array[Double] = js.native
  def copy(source: Vec3): Vec3 = js.native
  def lerp(v: Vec3, t: Double, target: Vec3): Unit = js.native
  def almostEquals(v: Vec3, precision: Double): Boolean = js.native
  def almostEquals(v: Vec3): Boolean = js.native
  def almostZero(precision: Double): Boolean = js.native
  def almostZero(): Boolean = js.native
  def isAntiparallelTo(v: Vec3, precision: Double): Boolean = js.native
  def isAntiparallelTo(v: Vec3): Boolean = js.native
  override def clone(): Vec3 = js.native
}

object Vec3 {
  @js.native
  @JSImport("cannon", "Vec3")
  object Vec3JS extends js.Object {
    val ZERO: Vec3 = js.native
    val UNIT_X: Vec3 = js.native
    val UNIT_Y: Vec3 = js.native
    val UNIT_Z: Vec3 = js.native
  }

  def apply(): Vec3 = new Vec3()
  def apply(x: Double, y: Double, z: Double): Vec3 = new Vec3(x, y, z)
  def zero: Vec3 = Vec3JS.ZERO
  def unitX: Vec3 = Vec3JS.UNIT_X
  def unitY: Vec3 = Vec3JS.UNIT_Y
  def unitZ: Vec3 = Vec3JS.UNIT_Z
}
