package api

abstract class Engine {
    abstract val usedEnergySources : MutableList<EnergySource>
    var isOn : Boolean = false;
    fun turnOfOn() {
        isOn = !isOn
    }
    fun turnOff(){
        isOn = false
    }
    fun turnOn(){
        isOn = true
    }
}
class ElectricEngine() : Engine() {
    override val usedEnergySources = mutableListOf(EnergySource.ELECTRIC)
}

