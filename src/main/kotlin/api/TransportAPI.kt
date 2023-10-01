package api

abstract class AbstractTransport (var position : Vec3 = Vec3()){
    abstract fun travel()
}
abstract class AliveVehicle()
//abstract class MechanicalVehicle(val engines : )
interface ISwimmable{
    fun swim()
}

interface IFlyable{
    fun fly()
}
interface ILand{
    fun drive()
}
