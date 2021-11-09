package dev.bug
package lectures.part_1_basic

object Expressions extends App {

  val res = 110 + 12
  println(res)

  println(2 + 10 * 2)

  println(5 ^ 7 ^ 1)
  // 001 - 1
  // 010 - 2
  // 011 - 3
  // 100 - 4
  // 101 - 5
  // 110 - 6
  // 111 - 7
  //    111
  // |  101
  //    111

  //    111
  // &  101
  //    101

  //    111
  // ^  101
  //    010
  // ^  001
  //    100

  println(res == 5)

  var aVar = 2
  aVar += 10 // side effect
  println(aVar)

  // IF expression
  val condition = true
  val conditionVal = if (condition) 6 else "5"
  println(conditionVal)

  println(if (condition) 10 else 6)

  println(println())

  var i = 0
  val aWhile = while (i < 20) {
    print(i)
    i += 1
  }

  println(aWhile)
  // НЕ использовать WHILE

  // Everything in Scala is an Expression
  val weirdValue = (aVar = 3) // Unit === void
  println(weirdValue)

  // Code block
  val codeBlock = {
    val y = 16
    val x = 16
    if (y < x) "hi" else 200.toString
  }: String

  println(codeBlock)

  val someVal = {
    2 < '5'
  }
  println(someVal)

  val someOtherVal = {
    if (someVal) 230 else 10
    456
  }

  println(someOtherVal)
}
