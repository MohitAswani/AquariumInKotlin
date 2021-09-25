package examples.functions

fun main(){
    val decoration=listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    println(decoration.filter { it[0]=='p' })
    // eager, creates a new list
    val eager=decoration.filter { it[0]=='p' }
    println("eager:$eager")

    // lazy, will wait until asked to evaluate
    val filtered=decoration.asSequence().filter{it[0]=='p'}
    println("filtered:$filtered")

    val newList=filtered.toList()
    println("new list:$newList")

    val lazyMap=decoration.asSequence().map{
        println("access:$it")
        it
    }
    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")

    val lazyMap2 = decoration.asSequence().filter {it[0] == 'p'}.map {
        println("access: $it")
        it
    }
    println("-----")
    println("filtered: ${lazyMap2.toList()}")
}