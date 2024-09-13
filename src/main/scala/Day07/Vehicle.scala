package Day07

class Vehicle(private var price: Int) {

  def this() = {
    this(0)
  }

  def getPrice: Int = {
    return this.price
  }

  def setPrice(price: Int): Unit = {
    this.price = price
  }
}
