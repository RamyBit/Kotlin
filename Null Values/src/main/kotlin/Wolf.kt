class Wolf {
    var hunger  = 10
    val food = "Meat"

    fun eat(){
        println("The Wolf is eating $food")
    }
}

class MyWolf{
    var wolf: Wolf? = Wolf()

    fun MyFunction(){
        wolf?.eat()
    }
}

fun getAlphaWolf(): Wolf? {
    return Wolf()
}