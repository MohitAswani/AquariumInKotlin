package examples.functions
import java.util.*

fun randomDay():String{
    val week= arrayOf("Mon","Tues","Wed","Thurs","Fri","Sat","Sun")
    return week[Random().nextInt(week.size)]
}
fun food(day:String=""):String{
    return when(day){
        "Mon"->"A"
        "Wed"->"B"
        "Fri"->"C"
        "Sun"->"D"
        else -> "E"
    }
}
fun feedTheFish()
{
    val day= randomDay()
    val feed= food(day)

    print("We feed $feed to the fish on $day")
    print("Change water: ${shouldChangeWater(day)}")
}
fun getDay():String
{
    return when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
    {
        1->"Sunday"
        2->"Monday"
        3->"Tuesday"
        4->"Wednesday"
        5->"Thursday"
        6->"Friday"
        7->"Saturday"
        else -> "Wrong day"
    }
}
fun main(args:Array<String>)
{
//    feedTheFish()
    println(getDay())
}