package com.chapter2

import org.scalatest.{FlatSpec, Matchers}

class Exercise2$4Test extends FlatSpec with Matchers {

  it should "uncurry" in {

    def f(a: Int)(b: Int): Int = a + b

    val result = new Exercise2$4().uncurry(f)(1, 1)

    result shouldBe 2

  }
}