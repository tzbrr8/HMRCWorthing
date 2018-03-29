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
    total shouldBe 0.85
  }

  it should "take a list of 2 x Apple And 2 xOrange and Return the Total" in {
    val items = List( "Apple", "Orange", "Apple", "Orange")
    val total = ShoppingCart(items)
    total shouldBe 1.10
  }

  it should "take a list of [Apple, Apple, Orange, Apple] and Return the Total" in {
    val items = List( "Apple", "Apple", "Orange", "Apple")
    val total = ShoppingCart(items)
    total shouldBe 1.45
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
    total shouldBe 0.85
  }



  it should "take list of just one apple and return half the total" in {
    val items = List( "Apple")
    val total = ShoppingCart(items)
    total shouldBe 0.60
  }

  it should "take list of even apples and return half the total" in {
    val items = List( "Apple", "Apple")
    val total = ShoppingCart(items)
    total shouldBe 0.60
  }

  it should "take list of even apples, more then one set and return half the total" in {
    val items = List( "Apple", "Apple", "Apple", "Apple", "Apple", "Apple")
    val total = ShoppingCart(items)
    total shouldBe 1.80
  }


  it should "take list of just one Orange and return half the total" in {
    val items = List( "Orange")
    val total = ShoppingCart(items)
    total shouldBe 0.25
  }

  it should "take list of even Oranges and return half the total" in {
    val items = List( "Orange", "Orange")
    val total = ShoppingCart(items)
    total shouldBe 0.50
  }

  it should "take list of 3 Oranges and return price of 2 orranges" in {
    val items = List( "Orange", "Orange", "Orange")
    val total = ShoppingCart(items)
    total shouldBe 0.50
  }

  it should "take list of multiple of 3 oranges and return 3 for price of 2" in {
    val items = List( "Orange", "Orange", "Orange", "Orange", "Orange", "Orange")
    val total = ShoppingCart(items)
    total shouldBe 1.00
  }

  it should "take list of multiple of 2 apples and 3 oranges" in {
    val items = List( "Apple", "Orange", "Apple", "Orange", "Orange")
    val total = ShoppingCart(items)
    total shouldBe 1.10
  }



}