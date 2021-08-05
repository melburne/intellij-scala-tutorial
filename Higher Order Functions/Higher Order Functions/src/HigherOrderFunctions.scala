object HigherOrderFunctions {
  def sumBetween(f: Int /*put here an appropriate type of an f input parameter*/ => Int /*put here an appropriate type of an f output result*/, a: Int, b: Int): Int = {
    def loop(x: Int, acc: Int): Int = {
      if (x > b) acc
      else loop(x + 1, acc + f(x)) // TODO, acc + f(x))
    }

    loop(a, 0 /*here you need to insert initial acc value*/)
  }

  def main(args: Array[String]): Unit = {
    println(sumBetween (x => x, 1, 10))
  }

}