package vehicle

class Plane(val isFlying : Boolean) : AbstractTransport(), IFlyable, ILandDriving {
    override fun travel() = if(isFlying) fly() else drive()

    override fun fly() = println("plane is flying")

    override fun drive() = println("landing or rising")

}