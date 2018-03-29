package com.htm.hmrc.worthing

class ShoppingCart {

  type Pounds = Double

  def checkout(items: List[String]): Pounds = {

    var total: Pounds = 0.00

    items.foreach {
      case "Apple" => total += 0.60
      case "Orange" => total += 0.25
      case _ => ()
    }

    total
  }
}

object ShoppingCart extends ShoppingCart {
  def apply(items: List[String]): Pounds = checkout(items)
}