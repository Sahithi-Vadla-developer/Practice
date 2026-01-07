package ConditionalLoops

object NestedLoops {
   def finalSalary(baseSalary: Double): Double ={


     // nested function to calculate tax
     def taxSalary(salary: Double): Double = {
       salary  * 0.10 ;// calculates tax 10%

     }
     def calBonus(salary: Double): Double = {
       salary *0.20 ;// 20% bonus
     }
     val tax= taxSalary( baseSalary )
     val bonus = calBonus(baseSalary)
     baseSalary - tax + bonus
   }


  def main(args: Array[String]): Unit = {

    val  salary=10000;
    val totalSalary=finalSalary((salary))
    println("total final salary=="+ totalSalary)

  }

}
