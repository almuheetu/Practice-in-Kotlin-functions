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

// for practice
tailrec fun plus(x: Int): Int {
    var z = x
    if (z >= 10) {
        return 0
    }
    z += 1

    println("Second_practice : $z")
    return plus(z)
}



fun testScope(): Int {
    var x = 10
    fun test(){
        var y = 5
        x *= 10
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
// for practice
fun practiceLambda(c: Int, d:Int): () -> Int{
    return { c * d }
}


// Non-local returns
fun ordinaryFunction(block: () -> Unit){
    println("Hi!")
}

//fun foo() {
//    ordinaryFunction {
//        return@ordinaryFunction
//    }
//}

// inline Function practice

inline fun inlined(block: () -> Unit){
    println("Hello inlineFunction")
}
fun foo() {
    inlined { return }
}


// more inline function practice
inline fun log(message: String){
    println(message)
}
// extra practice inline Function
inline fun f(crossinline body: () -> Unit){
    val f = Runnable { body() }
}


// Reified type parameters practice
inline fun <reified T> isInstance(value: Any): Boolean {
    return value is T
}
data class Point(val x: Int, val y: Int)
data class PointOne(val x: Boolean, val y: Boolean)

operator fun Point.unaryMinus() = Point(-x, -y)
operator fun PointOne.not() = PointOne(x.not(), y.not())
fun main() {

   /* println("${printHello("Shihab")}")
    val value = 89
    val valueOne: Int = 89
    val valueTwo = valueOne entu 5
    println(valueTwo)
    println()
    // Recursive
    minus(15)
    plus(1)*/
    // pass lambda
  /*  val valueThree = { 7 }
    println()
    println()
    println(getLambda(8, 8).invoke())
    println()
    println(practiceLambda(9, 3)())
    println("${testScope()}")
    // Non-local returns
    foo()
    //inline function call
    log("This message is logged inline")*/

    var a = 90

    println(-a)
    println(a.unaryPlus())
    println(a.unaryMinus())

}



















