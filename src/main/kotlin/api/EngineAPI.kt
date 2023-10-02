package api

abstract class Engine {
    abstract val usefulEnergy : Int
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
class ElectricEngine(override val usefulEnergy: Int) : Engine() {
    override val usedEnergySources = mutableListOf(EnergySource.ELECTRIC)
}
class NuclearEngine(override val usefulEnergy: Int) : Engine() {
    override val usedEnergySources = mutableListOf(EnergySource.ELECTRIC, EnergySource.NUCLEAR)
}
class InternalCombustionEngine(override val usefulEnergy : Int) : Engine() {
    override val usedEnergySources = mutableListOf(EnergySource.MECHANICAL)
}
class AntiMatterEngine(override val usefulEnergy: Int) : Engine() {
    override val usedEnergySources = mutableListOf(EnergySource.NUCLEAR, EnergySource.INNER)
}
class WarpEngine(override val usefulEnergy: Int) : Engine() {
    override val usedEnergySources = mutableListOf(EnergySource.DARK, EnergySource.EXOTIC)
}
