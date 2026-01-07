package collection

object samples {
  def main(args: Array[String]): Unit = {


    val a= Set(1,2,3,4)
    val b= Set(3,4,5,6)

    println(a union(b))
    println(a intersect(b))
    println(b diff(a))
    // Map

    val marks = Map("Math" -> 90, "Science" -> 95)

    println(marks("Math"))
    println(marks.get("English"))
    println(marks.get("Science"))
    println(marks("Science"))
    // Tuple
    val emp = ("Sahithi", 25, "Developer")

    println(emp._1)
    println(emp._2)
    println(emp._3)
//------------------------
    def getMinMax(nums: List[Int]): (Int, Int) = {
      (nums.min, nums.max)
    }

    val result = getMinMax(List(4, 2, 9, 1))
    println(s"Min: ${result._1}, Max: ${result._2}")
  }

}
