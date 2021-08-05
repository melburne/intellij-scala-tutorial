import scala.collection.compat.immutable.LazyList

object LazyEvaluation {
  var rec = 0
  def llRange(lo: Int, hi: Int): LazyList[Int] = {
    rec = rec + 1
    if (lo >= hi) LazyList.empty
    else LazyList.cons(lo, llRange(lo + 1, hi) /*call the llRange for the rest of the list*/)
  }
  def main(args: Array[String]): Unit = {
    llRange(1, 10).take(3).toList
    println(rec)
    llRange(1, 10).take(5).toList
    println(rec)
    llRange(1, 10).take(3).toList
    println(rec)
  }
}