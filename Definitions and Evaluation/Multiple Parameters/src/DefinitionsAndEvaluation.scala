import org.scalatest.{FlatSpec, Matchers}

object DefinitionsAndEvaluation extends FlatSpec with Matchers {

  def triangleArea(base: Double, height: Double): Double =
      /*insert an expression using both parameters*/
     1 / 2.0 * base * height

  def main(args: Array[String]): Unit = {
    println(triangleArea(3, 6))
  }
}