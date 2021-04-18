package lectures.part1basics

object CBNvsCBV extends App {

  def calledByValue(x: Long): Unit = {
    println("by value: " + x) // 1257387745764245L
    println("by value: " + x) // 1257387745764245L
  }

  // can add one function as param
  def calledByName(x: => Long): Unit = {
    println("by name: " + x) //System.nanoTime()
    println("by name: " + x) //System.nanoTime()
  }

  calledByValue(1257387745764245L)
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  //  printFirst(infinite(), 34)
  printFirst(34, infinite())
}