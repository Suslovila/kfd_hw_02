package vehicle

import api.AbstractTransport
import api.IFlyable
import api.ILand

class Plane(val isFlying : Boolean) : AbstractTransport(), IFlyable, ILand {
    override fun travel() = if(isFlying) fly() else drive()

    override fun fly() = println("plane is flying")

    override fun drive() = println("landing or rising")

}