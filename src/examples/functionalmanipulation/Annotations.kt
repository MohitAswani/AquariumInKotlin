package examples.functionalmanipulation

import kotlin.reflect.full.*

annotation class ImAPlant

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet
@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet

@ImAPlant class Plant(){
    @get:OnGet
    val isGrowing: Boolean=true
    @set:OnSet
    var needsFood: Boolean=false
    fun trim(){}
    fun fertilize(){}
}

fun testAnnotations(){
    val classObj=Plant::class
    println("Method:")
    for(m in classObj.declaredMemberFunctions)
    {
        println(m.name)
    }
    println("Annotations:")
    for(a in classObj.annotations)
    {
        println(a.annotationClass.simpleName)
    }
    println("Finding annotations:")
    val myAnnotationObject=classObj.findAnnotation<ImAPlant>()
    println(myAnnotationObject)
}

fun main(){
    testAnnotations()
}