package vehicle

import api.AbstractTransport
import api.ArtificialTransport
import api.ISwimmable

class Sailboat(override val maxSpeed: Double) : ArtificialTransport(), ISwimmable {

}