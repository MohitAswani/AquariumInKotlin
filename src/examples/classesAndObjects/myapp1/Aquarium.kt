package examples.classesAndObjects.myapp1

import kotlin.math.PI

open class Aquarium(open var length:Int =20,open var width:Int=60,open var height:Int=100){
    init {
        print("Aquarium initializing\n")
    }
//so a secondary constructor must include a call to the primary constructor by using the this keyword
    constructor(numberOfFishes: Int): this(){
        val tank=numberOfFishes*2000*1.1
        height=(tank/(length*width)).toInt()
    }
    open var volume:Int
    get()=((width*length*height)/1000).toInt()
//    private set(value)  //setter for open members cannot be private
    set(value)
    {
        height=(value*1000/(length*width)).toInt()
    }
    open val shape="Rectangle"
    open var water:Double=0.0
    get()=0.9*volume
    fun printSize(){
        print("Length:${this.length}\tWidth:${this.width}\tHeight:${this.height}\n")
        println("Volume: $volume l Water: $water l (${water/volume*100.0}% full)")
    }
}
class TowerTank(override var height: Int,var diameter:Int): Aquarium(height=height,width = diameter,length = diameter)
{
    override var volume: Int
        get() = (width/2*length/2*(height)/1000* PI).toInt()
        set(value) {
            height=((value * 1000 / PI) / (width/2 * length/2)).toInt()
        }
    override var water: Double = 0.8*volume
    override val shape: String
        get() = "Cylinder"

}