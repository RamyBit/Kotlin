
data class Recipe(val title: String,
                   val mainIngredient: String,
                   val isVegetarian: Boolean = false,
                   val difficulty: String = "Easy")

// This is an example of a class with a secondary constructor
class Mushroom(val size: Int, val isMagic: Boolean){
    constructor(isMagic_param: Boolean) : this(0,isMagic_param){
        println("This secondary constructor has been called!")
    }
}

fun findRecipes(title: String = "",
                ingredient: String,
                isVegetarian: Boolean = false,
                difficulty: String =""): Array<Recipe>{
    // TODO code to find recipes
    return arrayOf(Recipe(title, ingredient,isVegetarian,difficulty))
}
// This is an example of a overloaded function in kotlin
fun addNumbers(a: Int, b: Int) : Int{
    return a + b
}
fun addNumbers(a: Double, b: Double): Double{
    return a + b
}
fun main(args: Array<String>){
    val r1 = Recipe("Gulasch", false)
    val r2 = Recipe("Gulasch", false)
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