package vehicle

import api.AbstractTransport
import api.ILand

class Car : AbstractTransport(), ILand {
    override fun travel() = drive()

    override fun drive() = println("Car is going!!!!")

}