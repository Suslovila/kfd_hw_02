package vehicle

import api.IFlyable
import api.MechanicalTransport
import api.WarpEngine

class MultiUniverseSpaceCraft(engine: WarpEngine, override val maxSpeed: Double) : MechanicalTransport(engine), IFlyable {
}