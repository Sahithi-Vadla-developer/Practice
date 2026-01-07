package ConditionalLoops

object AgeCalculator {

  def result(ages: List[Int]): List[Int] = {
    for {
      age <- ages
      if age >= 18

    }yield age
  }


  def main(args: Array[String]): Unit = {
    val input = List(12, 21, 20,19,15, 18, 22, 13)
    val validVoter = result(input)
    print(validVoter)

  }
}
