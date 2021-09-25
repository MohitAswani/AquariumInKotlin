package examples.functions

import java.util.*

fun swim(speed: String="fast")
{
    print("Swimming $speed\n")
}
fun isTooHot(temperature: Long) = temperature>30
fun isDirty(dirty: Int) = dirty>25
fun isSunday(day: String) = day=="Sun"
fun dirtySensorReading() :Int {
    return Random().nextInt(100)
}
fun shouldChangeWater(day:String , temperature:Long=22 ,dirty:Int= dirtySensorReading()):Boolean
{
    return when {
        isSunday(day) ->true
        isTooHot(temperature) ->true
        isDirty(dirty) ->true
        else->false
    }
}
fun main(args: Array<String>)
{
    swim()
    swim("slow")
    swim(speed="slow but not that fast")

    feedTheFish();
}