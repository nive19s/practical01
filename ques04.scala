object WholesaleCost {
  def main(args: Array[String]): Unit = {
    val coverPrice = 24.95
    val discount = 0.4
    val shippingFirst50 = 3.0
    val shippingAdditional = 0.75
    val copies = 60
    val discountedPrice = coverPrice * (1 - discount)
    val totalBookCost = discountedPrice * copies
    val totalShippingCost = shippingFirst50 + (copies - 50) * shippingAdditional
    val totalCost = totalBookCost + totalShippingCost
    println(f"Total wholesale cost for $copies%d copies is Rs. $totalCost%.2f")
  }
}