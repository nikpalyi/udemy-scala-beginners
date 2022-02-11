package lectures.part1basics

import java.lang

object Functions extends App {

    def aFunction(a:String, b: Int): String = {
      a + " " + b
    }

      println(aFunction("hi",3)) // calling a function is also expression

      def aParameterlessFunction(): Int = 42
      println(aParameterlessFunction())
      // println(aParameterlessFunction) didn't work, but it was in the course

      def aRepeatedFunction(aString: String, n: Int): String = {
        if (n == 1) aString
        else aString + aRepeatedFunction(aString, n-1)
      }
      println(aRepeatedFunction("hello",4))

    // when other languages use mostly LOOPS, Scala use recursion !!

    // WHEN NEED LOOPS, USE RECURSION!!!

    def aFunctionWithSideEffects (aString: String): Unit = println(aString)

    def aBigFunction(n: Int): Int = {
      def aSmallerFunction(a: Int, b: Int) = a+ b

      aSmallerFunction(n, n-1)
    }
  def greetingForKids(name: String, age: Int): String = "Hi, my name is " + name + " and I am " + age + " years old"

  println(greetingForKids("Bonny", 12))

  /*
  2. factorial function 1 * 2 * 3 * $ .. * n
  3. fibonacci function
  f(1) = 1
  f(2) = 1
  f(n) = f(n - 1) + f(n - 2)
  4. check if number is prime
*/
  def factorial(n: Int): Int =
    if (n <= 0) 1
    else n * factorial(n - 1)

  println(factorial(9))

  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)

  // 1 1 2 3 5 8 13 21
  println(fibonacci(8))

//  def isPrime(n: Int): Boolean = {
//    def isPrimeUntil(t: Int): Boolean =
//      if (t <= 1) return true
//      else n % t != 0 && isPrimeUntil(t - 1)
//      isPrimeUntil(n / 2)
//}
//  println(isPrime(37))
}


