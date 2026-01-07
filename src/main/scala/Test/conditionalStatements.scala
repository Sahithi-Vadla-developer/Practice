package Test

class conditionalStatements  {

def don(a: Int,b:Int):Int = a+b
}
object conditionDemo{
  def main(args: Array[String]): Unit = {
    val calc= new conditionalStatements
    println(calc.don(2,3))
    
  }
}
