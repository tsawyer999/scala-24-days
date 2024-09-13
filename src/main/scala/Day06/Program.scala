package Day06

object Program {
  def main(args: Array[String]): Unit = {

    CartService.addProduct(new Vehicle(15000))
    CartService.addProduct(new Vehicle(21000))
    CartService.removeProduct(new Vehicle(15000))

    println(s"Total price is ${CartService.getTotal}")
  }
}
