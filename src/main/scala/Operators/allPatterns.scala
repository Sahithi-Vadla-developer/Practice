package Operators

object allPatterns {
  case class Person(age:Int,name:String,isActived: Boolean)
  def main(args: Array[String]): Unit = {


    //guard conditions

      val num=53;
      val result=num match {
      case n if n<0 && n % 2==0 =>"positive even "
      case n if n<0  => "positive odd "
      case _ =>"negative "
    }
      println(result);

    // Tuple Pattern Matching

      val people=List((27,"sahithi",true)
    ,(27,"shanthanu",true),
      (12,"niveksha",false),
      (40,"manju",false),
      (27,"kamakshi",true))
      for(data <- people) {

      val output = data match {
        case (age, name, isActive) if age > 18 && isActive =>
          s"$name is active adult"
        case (age, name, _) if age < 18 =>
          s"$name is  not active minor"
        case (age, name, _)  if age > 35=>
          s"$name almost citizen age   "
        case (_) =>
          "not eligible"


      }
      println(output)
    }
    //case pattern matching
      println("value of -----------case pattern matching ----------\n")
       val value = List((27, "sahithi", true)
      , (27, "sharanya", true),
      (12, "niveksha", false),
      (40, "manju", false),
      (27, "kamakshi", true))

      for ( people<- value) {

      val value = people match {
        case (age, name, isActive) if age > 18 && isActive =>
          s"$name is active adult"
        case (age, name, _) if age < 18 =>
          s"$name is  not active minor"
        case (age, name, _) if age > 35 =>
          s"$name almost citizen age   "
        case (_) =>
          "not eligible"


      }

        println(value);
    }


  }

}
