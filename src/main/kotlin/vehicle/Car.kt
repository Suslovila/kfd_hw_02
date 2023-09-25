package vehicle

class Car : AbstractTransport(), ILandDriving {
    override fun travel() = drive()

    override fun drive() = println("Car is going!!!!")

}