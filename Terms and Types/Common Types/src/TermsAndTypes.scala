object TermsAndTypes{

  def toHexStringMethod(): String = {
    16.toHexString//invoke the toHexString method here
  }

  def containsMethod(): Boolean = {
    (0 to 10).contains/*invoke the contains method here*/(10)
  }
  def dropMethod(): String = {
    "foo".drop/*invoke the drop method here*/(1)
  }

  def takeMethod(): String = {
    "bar".take/*invoke the take method here*/(2)
  }

  def main(args: Array[String]): Unit = {
    println(toHexStringMethod())
    println(containsMethod())
    println(dropMethod())
    println(takeMethod())
  }
}