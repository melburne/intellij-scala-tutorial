// Complete the method evaluating the area of a disk
object DefinitionsAndEvaluation{

  def area(x: Double) = Math.PI * x *x // the expression lacks the square of the radius

  def main(args: Array[String]): Unit = {
    println(area(5))
  }

}