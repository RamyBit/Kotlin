fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    println("Game Choice is: $gameChoice")
    println("User Choice is: $userChoice")
    printResult(options,gameChoice, userChoice)
}

fun getUserChoice(options: Array<String>): String {
    var userChoice=""
    var isValid = false
    while (!isValid){
        print("Please choose one of the following: ")
        for (option in options) print (" $option")
        println(".")
        val userInput = readLine()
        if (userInput != null && userInput in options){
            isValid = true
            userChoice = userInput
        }
        if (!isValid) println("Please enter a valid choice.")
    }
    return userChoice
}

fun printResult(options:Array<String>, gameChoice: String, userChoice: String) {
    if (gameChoice == userChoice) println("Tie!")
    else if ((userChoice == options[0] && gameChoice == options[2]) ||
        (userChoice == options[1] && gameChoice == options[0]) ||
        (userChoice == options[2] && gameChoice == options[1]))
        println("You Win!")
    else println("You Lose!")
}
fun getGameChoice(options: Array<String>): String {
    return options[(Math.random()*options.size).toInt()]
}

