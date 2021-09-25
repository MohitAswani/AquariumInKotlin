package examples.classesAndObjects.myapp1

fun buildAquarium(){
    val myAquarium= Aquarium()
    myAquarium.printSize()
    myAquarium.height=60
    myAquarium.printSize()
    val myAquarium1= Aquarium(100,10,100)
    myAquarium1.printSize()
    val myAquarium2= Aquarium(width = 20)
    myAquarium2.printSize()
    val myAquarium3= Aquarium(height = 50)
    myAquarium3.printSize()
    val myAquarium4= Aquarium(numberOfFishes = 20)
    myAquarium4.printSize()
    val myAquarium5= Aquarium()
    myAquarium5.printSize()
//    myAquarium5.volume=70 not possible since the setter is now private
    myAquarium5.printSize()
    val myAquarium6= Aquarium(25,25,40)
    myAquarium6.printSize()
    val myAquarium7= TowerTank(height = 45,diameter = 25)
    myAquarium7.printSize()
}
fun makeFish(){
    val shark= Shark()
    val pleco= Plecostomus()
    println("Shark:${shark.color}")
    shark.eat()
    println("Pleco:${pleco.color}")
    pleco.eat()
}
fun main(args:Array<String>)
{
//    buildAquarium()
    makeFish()
}