package Day07

object Program {
  def main(args: Array[String]): Unit = {

    val price1: Int = 17000
    var price2: Int = 24000

    println(s"Adding first vehicle valued at $price1")
    CartService.addProduct(new Vehicle(price1))

    println("Adding a second vehicle valued at ".concat(price2.toString))
    CartService.addProduct(new Vehicle(price2))

    println("Removing the first vehicle valued at " + price1)
    CartService.removeProduct(new Vehicle(price1))

    println(
      s"""
         |
         |Total price is: ${CartService.getTotal}
         |
         |This is a lot of money!
         |""".stripMargin)
  }
}
