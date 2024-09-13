package Day07

object CartService {
  
  private var total: Int = 0
  
  def addProduct(vehicle : Vehicle): Unit = {
    this.total += vehicle.getPrice
  }
  
  def removeProduct(vehicle: Vehicle): Unit = {
    this.total -= vehicle.getPrice
  }
  
  def getTotal: Int = {
    this.total
  }
}
