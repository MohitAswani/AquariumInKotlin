package examples.functionalmanipulation

fun labels(){
    outerLoop@ for(i in 1..100)
    {
        print("$i ")
        for(j in 1..100)
        {
            if(i>10) break@outerLoop //breaks to outerLoop
        }
    }
}
fun main(){
    labels()
}