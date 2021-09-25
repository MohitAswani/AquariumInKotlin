package examples.classesAndObjects.myapp

abstract class AquariumFish{
    //a non-abstract property of an abstract class is like a constant which cannot be overridden by its child classes
    val liveIn:String="Water"
    //an abstract property of an abstract must be implemented by the child classes
    abstract val color:String
    //an abstract function from within the abstract class must be implemented only in the child classes
    abstract fun dance()
    //but we can implement a function within the abstract class which cannot be overriden in child classes
}
interface FishAction{
    fun eat()
}
class Shark: AquariumFish(), FishAction {
    override val color: String
        get() = "Grey"


    override fun dance() {
        println("DANCING SHARK!!!")
    }
    override fun eat(){
        println("EAT SMALLER FISH")
    }
}
class Plecostomus: AquariumFish(), FishAction {
//    override val liveIn:String="Corals"
    override val color: String
        get() = "Gold"
    override fun dance() {
        println("DANCING Plecostomus!!!")
    }
    override fun eat(){
        println("EAT PLANTS")
    }
}