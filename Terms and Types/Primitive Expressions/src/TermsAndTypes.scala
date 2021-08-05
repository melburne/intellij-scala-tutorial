object TermsAndTypes{

  def sayHello(): String = {
    "Hello, " ++ "Scala!" //Finish the greetings here
  }

  def sumTheNumbers(): Int = {
    1 + 3 //Insert a number here, so the sum will be 4
  }

  def main(args: Array[String]): Unit = {
    println(sayHello())
    println(sumTheNumbers())
  }
}
