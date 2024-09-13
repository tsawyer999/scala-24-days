package Day04

class Vehicle {

  private var price: Int = 0

  def GetPrice(): Int = {
    return this.price
  }

  def SetPrice(price: Int): Unit = {
    this.price = price
  }
}
