package Test

object NestedFunction extends App {

  def calculateTotal(a: Int, b:Int): Int = {
    val sub = (x: Int, y: Int) => {
      x - y;
    }
  println("substracting Values--")
    sub(a,b)

  }
  println("calculates values -=>"+calculateTotal(60,15))

}
