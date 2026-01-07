package Test

object methodsFamiliar  {
  def main (args: Array[String]): Unit = {

    println {
      greet()}
    println{
      action(3,5)}
     println{ performAction(10,2)
    }
    println(greet())
    println(action(8, 5))
    println(performAction(15,3))
    println(greet())

    def performAction(a: Int, b:Int):Int={
      a/b;
    }
    println(performAction(12,50));
  }
  def greet(): String  ="Hey Hi Sahithi how is Scala "
  def action:(Int , Int)=>Int = (x, y)
  => x * y


}
