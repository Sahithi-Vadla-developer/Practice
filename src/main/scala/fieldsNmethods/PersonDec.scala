package fieldsNmethods

class onoso(name: String, id: Int) {
  def treat(): String = raw"Hi $name is  this your id= $id ";
}

object onoso {
  def greet(name: String, Id: Int): String = f" $name ver cool person with id number $Id";
}

object PersonDec {
  def main(args: Array[String]): Unit = {
    val pers=new onoso("Sahiti",1233);
println(pers.treat());
  }
  println(onoso.greet("Vaishnavi",2365));

}





