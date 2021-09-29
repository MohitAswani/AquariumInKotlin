package examples.generics

fun genericsExample(){
//    val aquarium=Aquarium(TapWater())
//    println("${aquarium.waterSupply.needsProcessing}")
//    aquarium.waterSupply.addChemicalCleaners()
//    println("${aquarium.waterSupply.needsProcessing}")
//    val aquarium2=Aquarium("string") cannot pass this due to T:watersupply
//    println(aquarium2.waterSupply)
//    val aquarium3=Aquarium(null) cannot pass this due to T:watersupply
//    println("Water supply is ${if(aquarium3.waterSupply==null) null else aquarium3.waterSupply}")
//    val aquarium4= Aquarium(LakeWater())
//    aquarium4.waterSupply.filter()  //if written without filter it throws an exception due to the check function
//    aquarium4.addWater()
    val cleaner = TapWaterCleaner()
    val aquarium = Aquarium(TapWater())
    aquarium.addWater(cleaner)
    isWaterClean(aquarium)
    println(aquarium.hasWaterSupplyOfType<TapWater>())
    println(aquarium.waterSupply.isOfType<TapWater>())
    println(aquarium.hasWaterSupplyOfType<TapWater>())
}
fun main(){
    genericsExample()
}
open class WaterSupply(var needsProcessing:Boolean)

class TapWater(): WaterSupply(true){
    fun addChemicalCleaners(){
        this.needsProcessing=false;
    }
}

class FishStoreWater(): WaterSupply(false)

class LakeWater(): WaterSupply(true)
{
    fun filter(){
        needsProcessing=false;
    }
}

interface Cleaner<in T: WaterSupply>{
    fun clean(waterSupply: T)
}

class TapWaterCleaner: Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) = waterSupply.addChemicalCleaners()
}

class Aquarium<out T: WaterSupply>(val waterSupply: T)
{
    fun addWater(cleaner: Cleaner<T>)
    {
        if(waterSupply.needsProcessing){
            cleaner.clean(waterSupply)
        }
        println("Water added")
    }


}

inline fun <reified R: WaterSupply>Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R

inline fun<reified T:WaterSupply> WaterSupply.isOfType() = this is T
fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

//We generally make a generic function when we want that function to take in an object of a class which requirres a generic

fun <T :WaterSupply> isWaterClean(aquarium: Aquarium<T>)
{
    println("aquarium water is clean: ${!aquarium.waterSupply.needsProcessing}")
}