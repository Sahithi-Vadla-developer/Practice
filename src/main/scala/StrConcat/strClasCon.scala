package StrConcat

object strClasCon {
  def main(args: Array[String]): Unit = {

     val ab="hello"
     val cd="bye bye"
     println(ab+"--"+cd)
     println(ab.concat(" ").concat(cd))

     val a="sahithi"
     val b= new String("sahithi")
     val s= if(a==b)"same name" else "not same"
     println(s)
  }

}
