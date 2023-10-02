package vehicle

import api.AliveTransport
import api.IFlyable

class Dragon(override val maxSpeed: Double) : AliveTransport(), IFlyable {

}