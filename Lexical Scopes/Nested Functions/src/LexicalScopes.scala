object LexicalScopes {
  def scopeRules(): Unit = {
    val x = 0

    def addOne(y: Int) = y + 1

    val result = {
      val x = addOne(3)
      x * x
    } + x

    println(result)
  }

  def main(args: Array[String]): Unit = {
    scopeRules()
  }
}