package api

sealed class AbstractTransport {
    var position : Vec3 = Vec3()
    var direction : Vec3 = Vec3()
    var speed : Double = 0.0
    abstract val maxSpeed : Double
    open fun move() {
        position.add(direction.normalize().scale(maxSpeed))
    }
}
abstract class AliveTransport() : AbstractTransport(){
    var isAlive : Boolean = true
    override fun move() {
        if (isAlive) super.move()
    }
}
abstract class ArtificialTransport : AbstractTransport()



abstract class MechanicalTransport(val engine : Engine) : ArtificialTransport() {
    override fun move() {
        if (engine.isOn) super.move()
    }
}

//Mostly they are "markers" for some logic of needed ( for example, if we need to do smth only with Flyable things)
interface ISwimmable
interface IFlyable
interface ILand
