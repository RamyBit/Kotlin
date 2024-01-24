data class Recipes(val title: String, val isVegetarian: Boolean)

fun main(args: Array<String>){
    val r1 = Recipes("Gulasch", false)
    val r2 = Recipes("Gulasch", false)
    val r3 = r1.copy(title = "Pizza")
    println("r1 hash code: ${r1.hashCode()}")
    println("r2 hash code: ${r2.hashCode()}")
    println("r3 hash code: ${r3.hashCode()}")
    println("r1 toString: ${r1.toString()}")
    println("r1 == r2  ${r1==r2}")
    println("r1 === r2 ${r1 === r2}")
    println("r1 == r3  ${r1 == r3}")
    println(r1)
    val (title, isVegetarian) = r1 // Destructuring declarations r1
    val (title2,isVegetarian2 ) = r1
    println("title is $title and vegetarian is $isVegetarian")
    println("After Destructuring declarations: title2 is $title2 and vegetarian2 is $isVegetarian2")
    println(r1)
}