package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {

  class Person (val name: String, favouriteMovie: String) {

    def likes(movie: String): Boolean = movie == favouriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String  = s"$name, what the heck?!"
    def isALive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favouriteMovie"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")  // equivalent
  // INFIX NOTATION = OPERATOR NOTATION

  // "operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)
  println(mary.+(tom))

  println(1 + 2)
  println(1.+(2))  // ALL OPERATORS ARE METHODS !!!

  // PREFIX NOTATION => unary operators
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-
  // unary_ prefix only works with - + ~ !
  println(!mary)
  println(mary.unary_!)

  // postfix notation , only works with def without parameters
  println(mary.isALive)
  println(mary isALive)

  // apply
  println(mary.apply())
  println(mary()) //equivalent to the previous, because we defined apply
}
