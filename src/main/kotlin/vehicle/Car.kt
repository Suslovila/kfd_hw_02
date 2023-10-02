package vehicle

import api.Engine
import api.ILand
import api.InternalCombustionEngine
import api.MechanicalTransport

class Car(override val maxSpeed: Double) : MechanicalTransport(InternalCombustionEngine(10)), ILand {

}