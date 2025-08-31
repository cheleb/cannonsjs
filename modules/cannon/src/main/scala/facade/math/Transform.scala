import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("CANNON.Transform")
class Transform(options: js.Object) extends js.Object {
  def this() = this(js.Object())
  var position: Vec3 = js.native
  var quaternion: Quaternion = js.native
}

object Transform {
  @js.native
  @JSGlobal("CANNON.Transform")
  object TransformJS extends js.Object {
    def pointToLocalFrame(
        position: Vec3,
        quaternion: Quaternion,
        worldPoint: Vec3,
        result: Vec3
    ): Vec3 = js.native
    def pointToWorldFrame(
        position: Vec3,
        quaternion: Quaternion,
        localPoint: Vec3,
        result: Vec3
    ): Vec3 = js.native
    def vectorToWorldFrame(
        quaternion: Quaternion,
        localVector: Vec3,
        result: Vec3
    ): Vec3 = js.native
    def vectorToLocalFrame(
        position: Vec3,
        quaternion: Quaternion,
        worldVector: Vec3,
        result: Vec3
    ): Vec3 = js.native
  }

  def apply(): Transform = new Transform()
  def apply(position: Vec3, quaternion: Quaternion): Transform = {
    val t = new Transform()
    t.position = position
    t.quaternion = quaternion
    t
  }

  def pointToLocalFrame(
      position: Vec3,
      quaternion: Quaternion,
      worldPoint: Vec3,
      result: Vec3
  ): Vec3 =
    TransformJS.pointToLocalFrame(position, quaternion, worldPoint, result)
  def pointToWorldFrame(
      position: Vec3,
      quaternion: Quaternion,
      localPoint: Vec3,
      result: Vec3
  ): Vec3 =
    TransformJS.pointToWorldFrame(position, quaternion, localPoint, result)
  def vectorToWorldFrame(
      quaternion: Quaternion,
      localVector: Vec3,
      result: Vec3
  ): Vec3 =
    TransformJS.vectorToWorldFrame(quaternion, localVector, result)
  def vectorToLocalFrame(
      position: Vec3,
      quaternion: Quaternion,
      worldVector: Vec3,
      result: Vec3
  ): Vec3 =
    TransformJS.vectorToLocalFrame(position, quaternion, worldVector, result)
}
