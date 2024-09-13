package Day04

object Program {
  def main(args: Array[String]): Unit = {
    val vehicle1 = new Vehicle()
    vehicle1.setPrice(11000)

    val vehicle2 = new Vehicle()
    vehicle2.setPrice(15000)

    val totalPrice = vehicle1.getPrice + vehicle2.getPrice

    println(s"Total price is $totalPrice")
  }
}
