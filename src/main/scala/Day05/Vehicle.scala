package Day05

class Vehicle(private var price: Int) {

  def this() = {
    this(0)
  }

  def GetPrice(): Int = {
    return this.price
  }

  def SetPrice(price: Int): Unit = {
    this.price = price
  }
}
