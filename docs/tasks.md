1. **Task**: implement math utility classes (Vec3, Quaternion, Mat3, Transform)
**Description**: Create Scala facade classes for cannon.js math utilities, providing vector, quaternion, matrix, and transform operations with Scala-idiomatic methods and operators.
**Purpose**: These are the foundational math classes used throughout cannon.js for representing positions, rotations, and transformations in 3D space.
**Behavior**: Classes will wrap JavaScript objects, exposing methods like vector addition, quaternion multiplication, and matrix operations, with Scala operators for fluent usage.
**Requirements**: 
* All standard math operations must be supported with correct type safety
* Performance should match JavaScript implementation with minimal overhead
* Scala 3 features like extension methods for operators
**Testing criteria**:
* Unit tests for all operations ensuring roundtrip identity (e.g., v + Vec3.zero == v)
* Edge cases like zero vectors, unit quaternions, and identity matrices
* Property-based tests for associativity and commutativity where applicable

2. **Task**: implement shape classes (Sphere, Box, Plane, ConvexPolyhedron, Cylinder, Heightfield, Particle, Trimesh)
**Description**: Create Scala facade classes for all cannon.js collision shapes, with builders for easy construction and methods for updating bounding spheres.
**Purpose**: Shapes define the collision geometry for bodies in the physics simulation.
**Behavior**: Each shape class will have constructors with required parameters (e.g., radius for Sphere), and methods like calculateWorldAABB for bounding box computation.
**Requirements**: 
* All shape types from cannon.js must be represented
* Builders should use case classes for immutable configuration
* Bounding radius updates must be handled automatically
**Testing criteria**:
* Construction tests with valid and invalid parameters
* Bounding box calculations verified against expected values
* Shape-specific edge cases (e.g., zero-radius sphere, degenerate convex hull)

3. **Task**: implement material and contact material classes
**Description**: Create Scala facade for Material and ContactMaterial classes, with friction and restitution properties.
**Purpose**: Materials define surface properties for collision responses.
**Behavior**: Material class takes friction/restitution values, ContactMaterial pairs two materials with specific interaction rules.
**Requirements**: 
* Support for material lookup in contact material table
* Default material handling
* Type-safe property access
**Testing criteria**:
* Material creation and property access
* Contact material pairing and lookup
* Default material fallback scenarios

4. **Task**: implement collision detection classes (AABB, Broadphase types, Ray, RaycastResult)
**Description**: Create Scala facade for collision primitives including axis-aligned bounding boxes, broadphase algorithms, rays, and raycast results.
**Purpose**: Handle collision detection and spatial queries in the physics world.
**Behavior**: AABB for bounding boxes, broadphase for initial collision pairs, Ray for line queries, RaycastResult for hit information.
**Requirements**: 
* All broadphase types (Naive, Grid, SAP) supported
* Raycast modes (ALL, ANY, CLOSEST) implemented
* Collision matrix management
**Testing criteria**:
* AABB intersection and extension tests
* Broadphase pair generation accuracy
* Raycast hit detection with various modes

5. **Task**: implement constraint classes (PointToPoint, Distance, Hinge, Lock, ConeTwist)
**Description**: Create Scala facade for all constraint types with equation management and motor support where applicable.
**Purpose**: Enforce physical relationships between bodies like joints and connections.
**Behavior**: Each constraint manages equations solved by the solver, with options like collideConnected and motor parameters.
**Requirements**: 
* All constraint types from cannon.js
* Equation update and solving integration
* Motor and limit support for applicable constraints
**Testing criteria**:
* Constraint creation and body attachment
* Equation count and solving verification
* Motor activation and limit enforcement

6. **Task**: implement solver classes (GSSolver, SplitSolver)
**Description**: Create Scala facade for constraint solvers with iteration control and equation management.
**Purpose**: Solve constraint equations to resolve forces and maintain physical relationships.
**Behavior**: Solvers iterate over equations, with options for relaxation and splitting for performance.
**Requirements**: 
* Support for both solver types
* Equation addition/removal
* Iteration count configuration
**Testing criteria**:
* Solver convergence on simple constraints
* Performance benchmarks with varying equation counts
* Edge cases with over-constrained systems

7. **Task**: implement body class
**Description**: Create Scala facade for the Body class with comprehensive configuration options, shape management, and physics integration.
**Purpose**: Represent physical objects with mass, position, velocity, and collision shapes.
**Behavior**: Body manages shapes, applies forces/impulses, integrates motion, and handles sleeping states.
**Requirements**: 
* All body types (DYNAMIC, STATIC, KINEMATIC)
* Shape addition with offsets and orientations
* Force/impulse application at world/local points
* Sleep management with customizable thresholds
**Testing criteria**:
* Body creation with various configurations
* Shape attachment and mass property updates
* Force application and motion integration
* Sleep state transitions

8. **Task**: implement world class
**Description**: Create Scala facade for the World class as the central physics simulation manager.
**Purpose**: Coordinate all physics entities, handle simulation stepping, and manage global state.
**Behavior**: World contains bodies, constraints, materials; steps simulation with broadphase, narrowphase, and solving; dispatches events.
**Requirements**: 
* Gravity, broadphase, and solver configuration
* Body and constraint management
* Event dispatching for simulation lifecycle
* Raycasting support
* Profiling capabilities
**Testing criteria**:
* World initialization with custom options
* Body addition and removal
* Simulation stepping accuracy
* Event callback execution
* Raycast query results

9. **Task**: implement vehicle classes (RaycastVehicle, RigidVehicle)
**Description**: Create Scala facade for vehicle simulations with wheels, suspension, and steering.
**Purpose**: Enable wheeled vehicle physics for games and simulations.
**Behavior**: Vehicles manage wheel constraints, apply steering/throttle, and handle suspension forces.
**Requirements**: 
* Wheel configuration and constraint setup
* Steering and throttle controls
* Suspension and friction modeling
**Testing criteria**:
* Vehicle creation and wheel setup
* Control input handling
* Suspension response to terrain
* Stability under various speeds

10. **Task**: implement subsystem classes (SPHSystem, Spring)
**Description**: Create Scala facade for advanced subsystems like fluid simulation and springs.
**Purpose**: Provide specialized physics features beyond rigid body dynamics.
**Behavior**: SPHSystem for particle-based fluids, Spring for elastic connections between bodies.
**Requirements**: 
* Particle management for SPH
* Spring force calculations
* Integration with world stepping
**Testing criteria**:
* Subsystem initialization and parameter setting
* Force computation accuracy
* Performance with large particle counts

11. **Task**: implement utility classes (EventTarget, Pool, Vec3Pool, TupleDictionary)
**Description**: Create Scala facade for utility classes handling events, object pooling, and data structures.
**Purpose**: Support infrastructure for the physics engine's internal operations.
**Behavior**: EventTarget for event dispatching, Pools for memory management, TupleDictionary for material lookups.
**Requirements**: 
* Event listener management
* Object reuse for performance
* Efficient key-value storage
**Testing criteria**:
* Event dispatching and listener execution
* Pool allocation and deallocation
* Dictionary operations with collision detection