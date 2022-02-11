package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 46)
  println(person.age)
  println(person.x)
  println(person.greet("Niki"))

  val author = new Writer("Stephen", "King", 1947)
  val novel = new Novel("The Shining", 1977, author)
  val imposter = new Novel("The Shining", 1977, author)

  println("The author's age: " + novel.authorAge)
  println(novel.isWrittenBy(author))
}

// constructor
class Person(name: String, val age: Int = 0) {
  // class parameters are NOT FIELDS!!!!!

  val x = 2 // this is a FIELD
  println(1 + 3)

  //method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  //overloading: methods with same name but different signatures (like Java)
  def greet(): Unit = println(s"Hi, I am $name")

  //multiple constructions
  def this(name: String) = this(name, 0)
  def this() = this("Jane Doe")
}

class Writer (firstName: String, surName: String, val year: Int) {
  def fullName: String = firstName + " " + surName
}

class Novel (name: String, yearOfRelease: Int, author: Writer) {
  def authorAge = yearOfRelease - author.year
  def isWrittenBy( author: Writer) = author == this.author
  def copy(newYearOfRelease: Int): Novel = new Novel(name, newYearOfRelease, author)
}

class Counter(val count: Int) {
  def incrementer = new Counter(count + 1) // immutability, INSTANCES are fixed, they cannot be modified
  def decrementer = new Counter(count - 1) // immutability, INSTANCES are fixed, they cannot be modified

  def incrementer(n: Int) = new Counter(count + 1)
  def decrementer(n: Int) = new Counter(count - 1)
}


