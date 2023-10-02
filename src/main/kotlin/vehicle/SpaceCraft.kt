package vehicle

import api.AntiMatterEngine
import api.IFlyable
import api.InternalCombustionEngine
import api.MechanicalTransport

class SpaceCraft(engine: AntiMatterEngine = AntiMatterEngine(100000), override val maxSpeed: Double) : MechanicalTransport(engine), IFlyable {
}