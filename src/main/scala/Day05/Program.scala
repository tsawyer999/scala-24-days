package Day05

object Program {
  def main(args: Array[String]): Unit = {
    val vehicle1 = new Vehicle(13000)
    val vehicle2 = new Vehicle(18000)

    var totalPrice = vehicle1.GetPrice() + vehicle2.GetPrice();

    println(s"Total price is $totalPrice")
  }
}
