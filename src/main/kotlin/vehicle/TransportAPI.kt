package vehicle

abstract class AbstractTransport{
    abstract fun travel()
}
interface ISwimmable{
    fun swim()
}

interface IFlyable{
    fun fly()
}
interface ILandDriving{
    fun drive()
}
