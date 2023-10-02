package vehicle

import api.*
//by default has electric engine, but  you can change it if needed
class Seaplane(engine : Engine = ElectricEngine(100), override val maxSpeed: Double) : MechanicalTransport(engine), IFlyable, ISwimmable {


}