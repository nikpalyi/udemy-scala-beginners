package lectures.part2oop

object Objects extends App {

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")
  object Person { // type + its only instance
    // "static"/"class" - level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    // factory method
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }
  class Person(val name: String) {
    // instance-level functionality
  }
  // COMPANIONS

  println(Person.N_EYES) // like in Java: static
  println(Person.canFly)

  // Scala object = SINGLETON INSTANCE
  val mary = new Person("Mary")
  val john = new Person("John")
  println(mary == john)

  val person1 = Person
  val person2 = Person
  println(person1 == person2) // true! they are pointing to the same instance: object.Person


  // => so Scala is more OO than JAva :D


  val bobbie = Person(mary, john)

  // Scala Applications = Scala object with
  // def main(args: Array[String]): Unit
  val k = 6.67e-11
}