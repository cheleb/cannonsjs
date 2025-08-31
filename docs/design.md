# ScalaJS Facade for Cannon.js

## Overview
The ScalaJS Facade for Cannon.js is a type-safe Scala wrapper around the cannon.js 3D physics engine, enabling Scala developers to integrate realistic physics simulations into web applications built with Scala.js. In common scenarios, this facade allows developers to create physics worlds with bodies (such as spheres, boxes, and planes), apply forces and constraints, simulate collisions and gravity, and render the results using libraries like Three.js. For instance, a typical use case involves setting up a world with gravity, adding dynamic bodies like bouncing balls or rigid vehicles, defining contact materials for friction and restitution, and stepping the simulation in a game loop to update positions and orientations in real-time.

## User Flows and Product Behavior

### Initialization and World Setup
Users begin by creating a `World` instance, which serves as the central container for the physics simulation. The world can be configured with options such as gravity (defaulting to (0, 0, -9.82) m/s²), broadphase algorithm (defaulting to NaiveBroadphase), solver (defaulting to GSSolver), and sleep settings. For example:
- A basic world setup might involve instantiating `World()` with custom gravity for different environments (e.g., zero gravity for space simulations).
- Advanced setups include selecting broadphase types like SAPBroadphase for performance in dense scenes or configuring the solver for complex constraint resolution.

The world manages collections of bodies, constraints, materials, and contact materials. Bodies are added via `addBody()`, which automatically updates the world's internal collision matrices and dispatches events like "addBody". Constraints (e.g., PointToPoint, Distance, Hinge) are added with `addConstraint()`, and materials/contact materials are registered to define interaction properties.

### Body Creation and Configuration
Bodies represent physical objects in the simulation and are created using the `Body` class with extensive configuration options:
- **Position and Orientation**: Set initial position (Vec3), quaternion (for rotation), and interpolated variants for smooth rendering.
- **Dynamics**: Define mass (0 for static bodies), velocity, angular velocity, force, and torque. Types include DYNAMIC (fully simulated), STATIC (immovable), and KINEMATIC (velocity-driven).
- **Damping and Factors**: Configure linear/angular damping (default 0.01) and factors to restrict motion along axes.
- **Sleep Management**: Enable auto-sleep with customizable speed limits (default 0.1) and time limits (default 1 second) to optimize performance by deactivating inactive bodies.
- **Collision Properties**: Set collision filter groups/masks, response flags, and bounding boxes/AABBs.

Shapes (e.g., Sphere, Box, Plane, ConvexPolyhedron) are attached to bodies using `addShape()`, with optional local offsets and orientations. Mass properties are automatically updated via `updateMassProperties()`, which computes inertia tensors and inverse masses.

### Simulation Stepping and Integration
The core simulation loop involves calling `World.step()` with a fixed timestep (e.g., 1/60 seconds) and optional time accumulation for variable framerate handling:
- **Internal Step Process**: Applies gravity, performs broadphase collision detection, generates narrowphase contacts, solves constraints using the configured solver, integrates body positions/velocities, and handles sleeping/waking.
- **Events**: Dispatches "preStep", "postStep", "beginContact", "endContact", "beginShapeContact", and "endShapeContact" events for user callbacks.
- **Forces and Impulses**: Bodies support `applyForce()` and `applyImpulse()` at world or local points, affecting linear and angular motion.
- **Raycasting**: Methods like `raycastAll()`, `raycastClosest()`, and `raycastAny()` enable querying the world for intersections, useful for mouse picking or line-of-sight checks.

### Constraints and Interactions
Constraints enforce relationships between bodies:
- **Types**: PointToPoint (ball/socket), Distance, Hinge (with optional motors), Lock, and ConeTwist.
- Each constraint has equations solved by the world's solver, with options like `collideConnected` to allow/disallow collisions between constrained bodies.

Materials and contact materials define surface properties:
- `Material` sets friction and restitution.
- `ContactMaterial` pairs materials with specific interaction rules, looked up automatically during collisions.

### Advanced Features
- **Broadphase and Solver Customization**: Swap broadphase (Naive, Grid, SAP) for performance tuning and solvers (GSSolver, SplitSolver) for constraint accuracy.
- **Profiling**: Enable `doProfiling` to measure performance in areas like broadphase, narrowphase, and solving.
- **Subsystems**: Add custom subsystems (e.g., for fluid simulation via SPHSystem) that update each step.
- **Sleeping**: Bodies enter SLEEPY state when slow, then SLEEPING after a timeout, with events for transitions.
- **Vehicles**: RaycastVehicle and RigidVehicle classes for wheeled simulations with suspension and steering.

### Error Handling and Edge Cases
- Invalid configurations (e.g., negative mass) are handled gracefully, defaulting to static behavior.
- Over-constrained systems may exhibit instability; users can adjust solver iterations or damping.
- Large scenes benefit from broadphase optimization to avoid O(n²) naive checks.

## Usability Summary
This facade provides a Scala-idiomatic interface with builders for complex objects (e.g., fluent Body construction), case classes for immutable configurations, and strong type safety leveraging Scala 3 features like enums for body types and given instances for conversions. It integrates seamlessly as a published artifact on Maven Central, supporting manual testing with examples and demos. Documentation uses Scala.js tools for comprehensive Scaladoc and API references mirroring cannon.js. The design prioritizes performance with minimal overhead, compatibility with Scala.js DOM and Three.js facades, and extensibility for custom solvers or shapes. Users report intuitive workflows for game development and simulations, with clear separation of concerns between physics logic and rendering.