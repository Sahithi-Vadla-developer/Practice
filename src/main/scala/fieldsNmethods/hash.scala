package fieldsNmethods

object hash {
  def main(args: Array[String]): Unit = {
    //    val ab = "vgyut"
    //    println(ab.hashCode());
    //    println(ab.toUpperCase);
    //    println(ab.charAt(2))

    val m =new Manager("shekar",156,60000,8)
    println(m.managerDetails())

  }

  class Employee(val name: String, Address: Int) {
    def details(): String = s"hello $name you live in address:$Address";

  }

  class Manager(name: String, Address: Int, salary: Double, val teamSize: Int)
    extends Employee(name, Address) {

    def managerDetails(): String =
      s"${details()},TeamSize :$teamSize"

  }
}
