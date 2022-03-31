package lectures.part2oop

object Objects2 extends App {

  object NutButter {

    val GRAMS = 340
    def canEat: Boolean = false

    // factory method - OR apply
    def from(nut1: NutButter, nut2: NutButter): NutButter = new NutButter("peanut")
    def apply(nut1: NutButter, nut2: NutButter): NutButter = new NutButter("hazelnut")
  }
  class NutButter(val ingredients: String) {

  }
  println(NutButter.GRAMS)
  println(NutButter.canEat)

  val peanutButteredSpoon = NutButter
  val almondButteredSpoon = NutButter

  println("Singleton Objects equals:")
  println(peanutButteredSpoon == almondButteredSpoon)

  val cashewButteredSpoon = new NutButter("cashew")
  val coconutButteredSpoon = new NutButter("coconut")

  println("Instance-level Objects equals:")
  println(cashewButteredSpoon == coconutButteredSpoon)

  val nutButter = NutButter.from(cashewButteredSpoon, coconutButteredSpoon)
  val nutButter2 = NutButter.apply(cashewButteredSpoon, coconutButteredSpoon)

  val nutButter3 = NutButter(cashewButteredSpoon,coconutButteredSpoon)

  println(nutButter.ingredients)
  println(nutButter2.ingredients)
  println(nutButter3.ingredients)

}
