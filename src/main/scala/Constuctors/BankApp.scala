package Constuctors

object BankApp {
  def main(args: Array[String]): Unit = {
  val acc=new BankAccount("",569854)
  acc.deposit(5000)
    println(acc.withDrawn(20000));
    println("current balance -"+acc.checkBalance())

  }

  class BankAccount(val accountNumber:String,private var balance:Double) {
    def deposit(amount: Double): Unit =
      balance += amount;


    def withDrawn(amount: Double): String =
      if (amount <= balance)
        balance -= amount
        s"withdrawn  amount $balance"
      else
        "insufficient balance";


    def checkBalance(): Double = balance
  }
}
