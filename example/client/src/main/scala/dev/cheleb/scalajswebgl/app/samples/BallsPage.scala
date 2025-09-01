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

    val world = new CANNON.World()
    world.gravity.set(0, 0, 0);
    world.broadphase = new CANNON.NaiveBroadphase();
    // // world.solver.iterations = 10;

    val shape = CANNON.Box(new CANNON.Vec3(1, 1, 1));

    val body = CANNON.Body(
      js.Dynamic.literal(
        mass = 1
      )
    )
    body.addShape(shape);
    body.angularVelocity.set(0, 10, 0);
    body.angularDamping = 0.5;
    world.addBody(body);
    println(world)
    println(shape)

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

    val geometry = new IcosahedronGeometry(R - 0.05, 10)

    val material = MeshPhongMaterial(
      color = 0x555555,
      wireframe = true
    )

    val earth = new Mesh(geometry, material);
    body.position.set(1, 1, 1);
    scene.add(earth)

    val camera =
      new PerspectiveCamera(30, window.innerWidth / window.innerHeight, 1, 100);

    camera.position.set(0, 0, 5)

    val renderer = WebGLRenderer(
      antialias = true,
      alpha = false
    )
    renderer.setPixelRatio(window.devicePixelRatio)
    val orbitControl = OrbitControls(camera, renderer.domElement)

    renderer.setClearColor("#851212ff", 1)
    renderer.setSize(window.innerWidth * margin, window.innerHeight * margin)

    def updatePhysics() = {

      // Step the physics world
      world.step(0.01);

      // Copy coordinates from Cannon.js to Three.js
      earth.position.set(body.position.x, body.position.y, body.position.z);
      earth.quaternion.set(
        body.quaternion.x,
        body.quaternion.y,
        body.quaternion.z,
        body.quaternion.w
      );

      println(body.position)

    }

    // Raycasting function to detect hover on pinners

    val animate: () => Unit = () => {

      // earth.rotation.y += 1.0505;

      orbitControl.update()
      updatePhysics()

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
