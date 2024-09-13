package Day04

object Program {
  def main(args: Array[String]): Unit = {
    val vehicle1 = new Vehicle()
    vehicle1.SetPrice(11000)

    val vehicle2 = new Vehicle()
    vehicle2.SetPrice(15000)

    var totalPrice = vehicle1.GetPrice() + vehicle2.GetPrice();

    println(s"Total price is $totalPrice")
  }
}
