package StrConcat

object Closureses {
  def main(args: Array[String]): Unit = {
    var x = 10

    val add = (y: Int) => y + x
    println(add(20))
    var a= 10

    val func = (b: Int) => b * a
    println(func(5)) // Output: 15


  }

}
