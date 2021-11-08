package dev.bug
package lectures.part_1_basic

object ValuesVariablesTypes extends App {

  // val - immutable
  val num: Int = 42
  println(num)

  // compiler can infer types
  val num2 = 100
  println(num2)

  val hi: String = "Hi =)"
  val alex: String = "Alex"
  println(s"${hi} ${alex}")

  val hasName: Boolean = true
  val ch: Char = 'A'
  val anIn: Int = ch
  val small: Short = 1234
  val veryBig: Long = 546546516546465L
  val fl: Float = 2.11F
  val doub: Double = 3.14

  // variables
  var aVar: Int = 16
  aVar = 17 // side effect
}
