// Explicit and Implicit
fun printHello(name: String?): Int {
    val a: Int = 89
    if (name != null)
        println("Hello $name")
    else
        println("Hi there!")

    return 22
}


// infix function
infix fun Int.entu(a: Int): Int {
    return this * a
}


//Extension function
fun Int.sum(x: Int, y: Int): Int {
    return this + x
}


// Tail recursive

tailrec fun minus(x: Int): Int {
    var y = x
    if (y <= 1) {
        return 0
    }
    y -= 1

    println(y)
    return minus(y)
}


fun main() {

    println("${printHello("Shihab")}")
    val value = 89
    val valueOne: Int = 89
    val valueTwo = valueOne entu 5
    println(valueTwo)


    println()
    // Recursive
    minus(15)
}



















