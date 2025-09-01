package dev.cheleb.scalajswebgl.samples.three

import com.raquo.laminar.api.L.*

import dev.cheleb.threesjs.*

import THREE.*

import org.scalajs.dom.window
import scala.scalajs.js

import org.scalajs.dom.Event

object BallsPage {

  val R = 1
  def apply() =

    // val world = new CANNON.World()

    val scalaMesh = Var(Option.empty[GLTFResult])
    val globeGroup = new Group()
    // Map of place name to the Threejs Group (pinner)
    // This will be used to store the groups for each place
    // and allow us to add/remove them from the globe
    // when the checkbox is checked/unchecked
    // This is a mutable map, so we can add/remove groups as needed

    // Elements for raycast hovering
    val raycaster = new Raycaster()
    raycaster.params.Points.threshold = 100
    raycaster.params.Line.threshold = 100

    val eartthDiv = div(
      h1("World of Scala"),
      div(
        cls := "scene-container",
        // Places sidebar
        div(
          cls := "places-sidebar"
        ),
        // Canvas container
        div(
          cls := "canvas-container"
        )
      )
    )

    val scene = Scene()

    val margin = 0.8

    val detail = 300
    val geometry = new IcosahedronGeometry(R - 0.05, 10)
    val pointGeometry = new IcosahedronGeometry(R, detail);

    val material = MeshPhongMaterial(
      color = 0x555555,
      wireframe = true
    )

    val textureLoader = TextureLoader()
    val colorMap =
      textureLoader.load("/ThreeScalaJS/demo/img/8081-earthmap10k.jpg")

    val pointMaterial = PointsMaterial(
      color = 0xf0f8ff,
      size = 0.02,
      map = colorMap,
      alphaMap = colorMap
    )
    val points = Points(pointGeometry, pointMaterial)

    val earth = new Mesh(geometry, material);
    globeGroup.add(earth)
    globeGroup.add(points)
    println(points)
    scene.add(globeGroup)

    val camera =
      new PerspectiveCamera(30, window.innerWidth / window.innerHeight, 1, 100);

    camera.position.set(0, 0, 5)

    val renderer = WebGLRenderer(
      antialias = true,
      alpha = false
    )
    renderer.setPixelRatio(window.devicePixelRatio)
    val orbitControl = OrbitControls(camera, renderer.domElement)

    renderer.setClearColor("#AAAAAA", 1)
    renderer.setSize(window.innerWidth * margin, window.innerHeight * margin)

    val loader = new GLTFLoader()

    loader.load(
      "/ThreeScalaJS/demo/res/scala.glb",
      obj => {
        scalaMesh.set(Some(obj))
      }
    )

    // Raycasting function to detect hover on pinners

    val animate: () => Unit = () => {

      // globeGroup.rotation.y += 0.0005;

      orbitControl.update()

      renderer.render(scene, camera);
    }
    renderer.setAnimationLoop(animate)

    val light = DirectionalLight(0xff00ff, 100)

    light.position.set(5, 5, 5)
    light.lookAt(0, 0, 0)
    scene.add(light)

    val ambientLight = AmbientLight(0x404040, 2)
    scene.add(ambientLight)

    // Append the renderer to the canvas container instead of eartthDiv directly
    eartthDiv.ref
      .querySelector(".canvas-container")
      .appendChild(renderer.domElement)

    window.addEventListener("resize", onWindowResize(camera, renderer, margin))

    eartthDiv
}
