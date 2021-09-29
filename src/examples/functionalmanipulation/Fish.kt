package examples.functionalmanipulation

data class Fish(var name:String)

fun fishExamples(){
    var fish=Fish("splashy")
//    with(fish.name)
//    {
//        println(capitalize())
//    }
    myWith(fish.name)
    {
        println(capitalize())
    }
    fish.run{
        name
    }
    val fish2=Fish(name="splashy").apply {
        name="sharky"
    }
    println(fish2.name)
    println(fish.let { it.name.capitalize()}.let{it+"fish"}.let{it.length}.let{it+31})

    println(fish)
}
fun myWith(name:String,block:String.()->Unit)
{
    name.block()
}
fun runExample(){
    JavaRun.runNow{println("Last parameter is a lambda as a Runnable")}
}
fun main(){
    fishExamples()
}