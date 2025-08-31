import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("CANNON.ConvexPolyhedron")
class ConvexPolyhedron() extends Shape {
  var vertices: js.Array[Vec3] = js.native
  var worldVertices: js.Array[Vec3] = js.native
  var worldVerticesNeedsUpdate: Boolean = js.native
  var faces: js.Array[js.Array[Int]] = js.native
  var faceNormals: js.Array[Vec3] = js.native
  var worldFaceNormalsNeedsUpdate: Boolean = js.native
  var worldFaceNormals: js.Array[Vec3] = js.native
  var uniqueEdges: js.Array[Vec3] = js.native
  var uniqueAxes: js.Array[Vec3] = js.native

  def computeEdges(): Unit = js.native
  def computeNormals(): Unit = js.native
  def getFaceNormal(i: Int, target: Vec3): Vec3 = js.native
  override def calculateLocalInertia(mass: Double, target: Vec3): Vec3 =
    js.native
  def getPlaneConstantOfFace(face_i: Int): Double = js.native
  def computeWorldVertices(position: Vec3, quat: Quaternion): Unit = js.native
  def computeLocalAABB(aabbmin: Vec3, aabbmax: Vec3): Unit = js.native
  def computeWorldFaceNormals(quat: Quaternion): Unit = js.native
  override def updateBoundingSphereRadius(): Unit = js.native
  def calculateWorldAABB(
      pos: Vec3,
      quat: Quaternion,
      min: Vec3,
      max: Vec3
  ): Unit = js.native
  override def volume(): Double = js.native
  def getAveragePointLocal(target: Vec3): Vec3 = js.native
  def transformAllPoints(offset: Vec3, quat: Quaternion): Unit = js.native
  def pointIsInside(p: Vec3): Boolean = js.native
}

object ConvexPolyhedron {
  @js.native
  @JSGlobal("CANNON.ConvexPolyhedron")
  object ConvexPolyhedronJS extends js.Object {
    def computeNormal(va: Vec3, vb: Vec3, vc: Vec3, target: Vec3): Vec3 =
      js.native
    def project(
        hull: ConvexPolyhedron,
        axis: Vec3,
        pos: Vec3,
        quat: Quaternion,
        result: js.Array[Double]
    ): Unit = js.native
  }

  def apply(
      points: js.Array[Vec3],
      faces: js.Array[js.Array[Int]],
      uniqueAxes: js.Array[Vec3]
  ): ConvexPolyhedron = {
    val cp = js.Dynamic
      .newInstance(js.Dynamic.global.CANNON.ConvexPolyhedron)(
        points,
        faces,
        uniqueAxes
      )
      .asInstanceOf[ConvexPolyhedron]
    cp
  }
  def apply(
      points: js.Array[Vec3],
      faces: js.Array[js.Array[Int]]
  ): ConvexPolyhedron = {
    val cp = js.Dynamic
      .newInstance(js.Dynamic.global.CANNON.ConvexPolyhedron)(points, faces)
      .asInstanceOf[ConvexPolyhedron]
    cp
  }
  def apply(points: js.Array[Vec3]): ConvexPolyhedron = {
    val cp = js.Dynamic
      .newInstance(js.Dynamic.global.CANNON.ConvexPolyhedron)(points)
      .asInstanceOf[ConvexPolyhedron]
    cp
  }
}
