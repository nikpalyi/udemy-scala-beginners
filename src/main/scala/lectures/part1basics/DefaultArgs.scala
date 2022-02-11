package lectures.part1basics

object DefaultArgs extends App {

  def trFact(n: Int, acc: Int = 1): Unit =
    if (n <= 0) acc
    else trFact(n-1, n*acc)

    val fact10 = trFact(10,2)

    def savePicture(format: String, width: Int, height: Int): Unit = println("saving picture")
    savePicture("jpg", 800, 600)

    

}
