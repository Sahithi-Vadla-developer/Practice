package ConditionalLoops
import scala.util.control.Breaks._

object BreakContinue {

  def main(args: Array[String]): Unit = {
    breakable  {
      for (i <- 1 to 10) {
        if (i == 5) {
          break
        }
        println(i)
      }
    }
println(" break loop exceuted")
  }
  //continue
  for (k <- 1 to 5) {
        if (k != 3) { // acts like continue
          println(k)
        }
      }
  println("-----------")
  

}
