package Test

object sample extends App {

  //def  main(args :Array[String]): Unit = {
    println("Hello World scala-I am learning scala ")

    val x=10
    val y= if(x>5) "greater" else "lesser"
    println(y)

    println("---------------Comparing Strings-------------------")
    private val i="20"
    private var ab="20"
    private val xy=if(i==ab) {
        "print together"
    } else {
        "not same"
    }
    println(xy)


    val total = 100 + 300
    println("total amount=" +total)

}
