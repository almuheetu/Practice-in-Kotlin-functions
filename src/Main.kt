fun printHello(name: String?): Int {
  val a: Int = 89
  if (name != null)
    println("Hello $name")
  else
    println("Hi there!")

  return 58
}
fun main() {

  println("${printHello("Shihab")}")
}


















