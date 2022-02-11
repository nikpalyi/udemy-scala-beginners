package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION
  print(x)
  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 ==x))
  // ! && ||

  var aVariable = 2
  aVariable +=3 // also works with -= *= /= - ... side effects
  // SIDE EFFECTS = changing a variable
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE AND/OR TYPE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)

  var i = 0
  val aWhile = while (i < 10) {
    println(i+=1)
  }

  //  never write this again.

  //Everything in Scala is an Expressions

  val aWeirdValue = (aVariable = 3)  // Unit == void => don't return anything meaningful
  println(aWeirdValue)

  // SIDE EFFECTS: println(), whiles, reassigning

  // CODE BLOCKS

  val aCodeBlock = {
    val y = 2
    val z = y +1

    if (z>2) "Hello" else "Bye"
  }
  //1. difference between "hello world" vs println("hello world")? => first is a String typed value , second is a Unit Expression
  // 2.

  val someValue = {
    2 < 3
  } // false

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
}
