fun main(args: Array<String>) {
    var x = 10
    while ( x > 0){
        println("Hello World!")
        println("Count down start at: $x")
        x -=1
        // Try adding program arguments via Run/Debug configuration.
        // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
        println("Program arguments: ${args.joinToString()}")
    }

}