package lectures.part2oop

object Inheritance2 extends App {

  //single class inheritance: single Mum
  sealed class Bird {
    val creatureType = "Glasgowian"
    def sing = println("kukurikuu")
  }

  class Parrot extends Bird {
    def trill = {
      sing
      println("Tra la la la")
    }
  }

  val parrot = new Parrot
  parrot.trill

  //constructors
  class Plant(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Tree(name: String, age: Int, color: String) extends Plant(name)

  // overriding
  class Penguin(override val creatureType: String) extends Bird {
    // override val creatureType = "Skandinavian"
     override def sing = {
       super.sing
       println("Bip bip, bip bip")
     }
  }
  val penguin = new Penguin("Icelandian")
  penguin.sing
  println(penguin.creatureType)

  val unknownBird: Bird = new Penguin("caesar")
  unknownBird.sing

}
