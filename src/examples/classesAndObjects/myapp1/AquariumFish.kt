package examples.classesAndObjects.myapp1

interface FishColor{
    val color : String
}
interface FishAction{
    fun eat()
}
object GoldColor: FishColor {  //since each class refers to the same object hence it know as singleton class
    override val color: String
        get() = "Gold"
}
class PrintingFishAction(val food:String) : FishAction {
    override fun eat() {
        println(food)
    }
}
class Shark: FishColor, FishAction {
    override val color: String
        get() = "Grey"
    override fun eat(){
        println("hunt and eat fish")
    }
}
class Plecostomus(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor{
}