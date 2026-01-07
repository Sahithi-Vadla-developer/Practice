package ConditionalLoops



object SalaryEvaluator {

  def main(args: Array[String]): Unit = {

    val salary = 46000;
  val category=
    if (salary < 30000) {
      "salary is low"
    }
    else if (salary <= 60000) {
      "salary is medium"
    }
    else {
      "salary is high"

    }
    print(category);

  }
}
