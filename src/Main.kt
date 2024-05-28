// Explicit and Implicit
fun printHello(name: String?): Int {
  val a: Int = 89
  if (name != null)
    println("Hello $name")
  else
    println("Hi there!")

  return 58
}


// infix function
infix fun Int.entu(a: Int): Int {
  return this * a
}


fun main() {

  println("${printHello("Shihab")}")
}



















