package CustomExtractors

object RegexExpression {

  private object Email {
    def unapply(str: String): Option[(String, String)] = {
      val parts = str.split("@")
      if (parts.length == 2 && parts(0).nonEmpty && parts(1).nonEmpty)
        Some(parts(0), parts(1))
      else
        None
    }
  }

  def main(args: Array[String]): Unit = {
    val ip = List(
      "sahithi@gmail.com",
      "sahithi2@gmail.com",
      "sahithi3@gmail.com",
      "sahithi4@",
      "@gmail.com")
    for (email <- ip) {
      email match {
        case Email(user, domain) =>
          println(s"User--$user \n,Domain---$domain")


        case _ =>
          println("invalid email")
      }

    }

  }
}
