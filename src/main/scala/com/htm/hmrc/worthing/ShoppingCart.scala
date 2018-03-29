package com.htm.hmrc.worthing

class ShoppingCart {

  type Pounds = BigDecimal

  def checkout(items: List[String]): Pounds = {

    var total: Pounds = 0.00
    var apples: Int = 0
    var oranges: Int = 0

    items.foreach {
      case "Apple" => apples += 1;  if(apples % 2 != 0) total += 0.60;
      case "Orange" => oranges += 1; if(oranges % 3 != 0) total += 0.25;
      case _ => ()
    }

    total
  }
}

object ShoppingCart extends ShoppingCart {
  def apply(items: List[String]): Pounds = checkout(items)
}