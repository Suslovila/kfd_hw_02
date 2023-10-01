package vehicle

import api.AbstractTransport
import api.IFlyable
import api.ISwimmable

class Seaplane(val mode : Mode) : AbstractTransport(), IFlyable, ISwimmable {

    override fun travel() = when(mode) {
            Mode.FLY -> fly()
            Mode.SWIM -> swim()
        }

    override fun swim() = println("Seaplane is swimming!")


    override fun fly() = println("Seaplane is flying!")

    enum class Mode{
        FLY, SWIM
    }
}