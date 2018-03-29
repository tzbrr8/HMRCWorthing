package com.htm.hmrc.worthing

import org.scalatest.{FlatSpec, Matchers}

class ShoppingCartSpec extends FlatSpec with Matchers{

  it should "take a list of Apple And Orange and Return the Total" in {
    val items = List("Apple", "Orange")
    val total = ShoppingCart(items)
    total shouldBe 0.85
  }

  it should "take a list of 1 x Apple And 2 xOrange and Return the Total" in {
    val items = List( "Orange", "Apple", "Orange")
    val total = ShoppingCart(items)
    total shouldBe 1.10
  }

  it should "take a list of 2 x Apple And 1 xOrange and Return the Total" in {
    val items = List( "Apple", "Orange", "Apple")
    val total = ShoppingCart(items)
    total shouldBe 1.45
  }

  it should "take a list of 2 x Apple And 2 xOrange and Return the Total" in {
    val items = List( "Apple", "Orange", "Apple", "Orange")
    val total = ShoppingCart(items)
    total shouldBe 1.70
  }

  it should "take a list of [Apple, Apple, Orange, Apple] and Return the Total" in {
    val items = List( "Apple", "Apple", "Orange", "Apple")
    val total = ShoppingCart(items)
    total shouldBe 2.05
  }

  it should "take a list of [] and Return the Total" in {
    val items = List( )
    val total = ShoppingCart(items)
    total shouldBe 0.00
  }

  it should "take a list of [Apple, Apple, Orange, BadApple] and Return the Total" in {
    //assumption that invalid items are ignored and binned.
    val items = List( "Apple", "Apple", "Orange", "BadApple")
    val total = ShoppingCart(items)
    total shouldBe 1.45
  }


}