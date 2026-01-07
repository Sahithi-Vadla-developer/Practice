package Operators

object PatternMatching {
  def main(args: Array[String]): Unit = {

    val input="sivaram"
    input.toLowerCase match{
      case s if s.exists("aeiou".contains)=>println("string has vowels ")
      case  _  =>
      println("no vowels")
    }


  }

}
