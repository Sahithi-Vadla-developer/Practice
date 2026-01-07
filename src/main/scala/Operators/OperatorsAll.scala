package Operators

object OperatorsAll {
  def main(args: Array[String]): Unit = {
    //working on operators

    val a=2024;
    val b=20;
    val x=9;
    val y=13;
//
//    println(a*b);
//    println(a-b);
//    println(a/b);
//    println(a+b);
//
//    val c=if(a>b) true else false
//    println("value is --"+c)
//    val d= if(a==b) true else false
//    println("valuse d is equal--"+d)
//
//   val t= if(x>y && a<b) "perfect match " else " not a perfect values "
//    println(t)
//    val tq= if (x > y  || a > b) "perfect match " else " not a perfect values "
//    println(tq)

    val leapYear=if(a%4==0 && a % 100!=0) "it is leap year " else " not a leap year "
    println(leapYear);
    val year=2024
    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
      println(s"$year is a Leap Year")
    } else {
      println(s"$year is NOT a Leap Year")
    }
//finding the largest
    val largest=
    if(b>=x && b>=y)("b is largest",b)
else if(x>=b && x>=y)("x is largest ",x)
else ("y is largest",y)
      println(s"$largest with value")

    //Vowels
    val vow="rythm"
    val con="aeiouAEIOU"
     // if("aeiouAEIOU".contains(vow))println("vowels") else println("consoants");

     val hasVowel=vow.exists(ch=>con.contains(ch))
    if(hasVowel)println("string contains vowels")else println("not a vowels string ")


  }

}
