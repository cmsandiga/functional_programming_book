package com.chapter2

import org.scalatest.{FlatSpec, Matchers}

class Exercise2$2Test extends FlatSpec with Matchers {

  it should "order with one element" in {
    val result = new Exercise2$2().isSorted[Int](Array(1), (a, b) => a <= b)
    result shouldBe true
  }

  it should "be false when is unordered with two elements" in {
    val result = new Exercise2$2().isSorted[Int](Array(2, 1), (a, b) => a <= b)
    result shouldBe false
  }

  it should "be false when last elements are unordered" in {
    val result = new Exercise2$2().isSorted[Int](Array(1, 2, 3, 4, 5, 9, 8), (a, b) => a <= b)
    result shouldBe false
  }
}
