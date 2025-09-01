package CANNON

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("cannon", "Trimesh")
class Trimesh() extends Shape {
  var vertices: js.Array[Double] = js.native
  var indices: js.Array[Int] = js.native
  var normals: js.Array[Double] = js.native
  var aabb: js.Any = js.native // AABB
  var edges: js.Array[Int] = js.native
  var scale: Vec3 = js.native

  def updateEdges(): Unit = js.native
  def updateNormals(): Unit = js.native
  def updateAABB(): Unit = js.native
  override def updateBoundingSphereRadius(): Unit = js.native
  override def calculateLocalInertia(mass: Double, target: Vec3): Vec3 =
    js.native
  def computeLocalAABB(aabb: js.Any): Unit = js.native
  override def volume(): Double = js.native
  def calculateWorldAABB(
      pos: Vec3,
      quat: Quaternion,
      min: Vec3,
      max: Vec3
  ): Unit = js.native
  def getTrianglesInAABB(aabb: js.Any, result: js.Array[Int]): js.Array[Int] =
    js.native
  def setScale(scale: Vec3): Unit = js.native
}

object Trimesh {
  def apply(vertices: js.Array[Double], indices: js.Array[Int]): Trimesh = {
    val t = js.Dynamic
      .newInstance(js.Dynamic.global.cannon.Trimesh)(vertices, indices)
      .asInstanceOf[Trimesh]
    t
  }
}
