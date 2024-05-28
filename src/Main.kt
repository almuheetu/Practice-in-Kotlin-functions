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


fun main() {

  println("${printHello("Shihab")}")
  val value = 89
  val valueOne: Int = 89
  val valueTwo = valueOne entu 5
  println(valueTwo)
}



















