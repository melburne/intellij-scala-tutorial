import org.scalatest.{FlatSpec, Matchers}

object ObjectOrientedProgramming{
  var nonEmptyExample = new NonEmpty(7, Empty, Empty) /*Create a NonEmpty contatining 7*/

  def main(args: Array[String]): Unit = {
    println(Empty contains 2)
    println(nonEmptyExample contains 7)
  }
}