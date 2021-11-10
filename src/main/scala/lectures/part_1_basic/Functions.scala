package dev.bug
package lectures.part_1_basic

object Functions extends App {

  def aFunc(a: String, b: Int) =
    a + " " + b

  println(aFunc("Hello", 5))

  def parameterlessFunc(): Int = 200

  println(parameterlessFunc())

  def repeatedFunc(str: String, n: Int): String = {
    if (n == 1) str
    else str + repeatedFunc(str, n - 1)
  }

  println(repeatedFunc("Hi", 5))

  // When you need loops, use recursion

  def funcWithSideEffects(str: String): Unit = println(str)

  funcWithSideEffects("Bad =(")

  def bigFunc(n: Int): Int = {
    def smallerFunc(a: Int, b: Int): Int = a + b

    smallerFunc(n, n - 1)
  }

  println(bigFunc(30))

  // 1.
  def hiFunc(name: String, age: Int): String = s"Hi, my name is $name and I am $age years old."

  println(hiFunc("Alex", 39))

  // 2. Factorial
  def fact(n: BigInt): BigInt = {
    def fact(n: BigInt, acc: BigInt): BigInt = {
      if (n == 1) acc
      else fact(n - 1, acc * n)
    }

    fact(n, 1)
  }

  println(fact(50))

  // 3. Fibbonacci
  def fibb(n: BigInt): BigInt = {
    if (n <= 2) 1
    else fibb(n - 1) + fibb(n - 2)
  }

  println(fibb(8))

  // 4.
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(2000))
}
