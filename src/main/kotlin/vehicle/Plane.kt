package vehicle

import api.*

class Plane(engine : InternalCombustionEngine = InternalCombustionEngine(200), val isFlying : Boolean, override val maxSpeed: Double) : MechanicalTransport(engine), IFlyable, ILand