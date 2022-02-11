package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"
                   //012345678901
  println(str.charAt(2)) //l
  println(str.substring(7, 11)) // I am
  println(str.split(' ').toList) // List(Hello,, I, am, learning, Scala)
  println(str.startsWith("Hello")) // true
  println(str.replace(" ","*")) // Hello,*I*am*learning*Scala

  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')  // a45z
  println(str.reverse)
  println(str.take(4).toUpperCase().reverse) // LLEH

  // Scala-specific: String interpolators.

  // S-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"
  println(greeting)
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1}"
  println(anotherGreeting)

  //F-interpolators
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute"
  println(myth)

  // raw-interpolator
  println(raw"This is a \n newLine") //it will print literally
  val escaped = "This is a \n newLine"
  println(raw"$escaped")
}
