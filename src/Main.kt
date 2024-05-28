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

fun testScope(): Int {
    var x = 10
    fun test(){
        var y = 5
        x = x * 10
    }
    val lambda = {
        val y = 5
            x + y
    }
    return x
}

fun getLambda(x: Int, y: Int): () -> Int{
    return { x + y}
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
    // pass lambda
    val valueThree = { 7 }
    println()
    println()
    println(getLambda(8, 8).invoke())
}



















