package Day05

class Vehicle(private var price: Int) {

  def this() = {
    this(0)
  }

  def getPrice: Int = {
    this.price
  }

  def setPrice(price: Int): Unit = {
    this.price = price
  }
}
