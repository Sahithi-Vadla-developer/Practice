package ConditionalLoops

object Loops {
  def main(args: Array[String]): Unit = {

  // Nested For Loops 
    for {
      i <- 1 to 3
      j <- 1 to 2
    } {
      println(s"i=$i j=$j")
    }


    //   for(i <- 1 to 5 ){
//      println(i)
//    }
//    for (j <- 1 to 10 ) {
//      println(j)
//    }
// Guards

//for(i <- 1 to 10 if i % 2==0){
//  println(i)
//}

  }
println("hello")

}
