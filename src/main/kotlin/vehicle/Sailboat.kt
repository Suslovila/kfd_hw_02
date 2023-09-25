package vehicle

class Sailboat : AbstractTransport(), ISwimmable {
    override fun travel() = swim()


    override fun swim() = println("Sailboat is swimming")

}