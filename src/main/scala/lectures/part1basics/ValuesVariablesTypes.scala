package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x = 42
  println(x)
  // VALS ARE IMMUTABLE

  // compiler can infer types

  val aString : String = "hello"
  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val aInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 928398738793222222
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // variables
  var aVariable: Int = 4
  aVariable = 5 // side effects - allow us to see what programs are doing

}
