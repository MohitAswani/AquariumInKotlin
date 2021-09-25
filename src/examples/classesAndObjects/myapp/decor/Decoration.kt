package examples.classesAndObjects.myapp.decor

data class Decoration(val rocks:String){

}
data class Decoration2(val rocks: String,val wood:String,val diver:String)
{}
fun makeDecorations(){
    val decoration1= Decoration("granite")
    println(decoration1)

    val decoration2= Decoration("slate")
    println(decoration2)

    val decoration3= Decoration("slate")
    println(decoration3)

    val refDecoration3=decoration3
    val copydecoration3=decoration3.copy()

    println(decoration1.equals(decoration2))
    println(decoration3.equals(decoration2))
    println(decoration3===decoration2)
    println(decoration3.equals((copydecoration3)))
    println(decoration3===copydecoration3)
    println(decoration3.equals(refDecoration3))
    println(decoration3===refDecoration3)
}
fun makeDecorations2(){
    val d5= Decoration2("crystal","wood","diver")
    println(d5)

    val (rock,_,diver)=d5
    println(rock)
//    println(wood)
    println(diver)
}
enum class Color(val rgb:Int){
    RED(0xFF0000),GREEN(0x00FF00),BLUE(0x0000FF);
}

sealed class Seal
class SeaLion : Seal()
class Walrus : Seal()

fun matchSeal(seal : Seal):String{
    return when(seal){
        is Walrus -> "Walrus"
        is SeaLion -> "sea lion"
    }
}
fun main(){
    makeDecorations()
    makeDecorations2()

    println(Color.RED.name)
    println(Color.BLUE.ordinal)
    println(Color.GREEN.rgb)
}