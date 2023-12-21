fun main(args: Array<String>) {
    val words1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val words2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val words3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    val size1 = words1.size
    val size2 = words2.size
    val size3 = words3.size

    for (i in 1..4) {
        val rnd1 = (Math.random() * size1).toInt()
        val rnd2 = (Math.random() * size2).toInt()
        val rnd3 = (Math.random() * size3).toInt()
        println("${words1[rnd1]} ${words2[rnd2]} ${words3[rnd3]}")
    }
}