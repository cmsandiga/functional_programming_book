package com.chapter2

import org.scalatest.{FlatSpec, Matchers}

class Exercise2$3Test extends FlatSpec with Matchers {

  it should "curry" in {
    def result = new Exercise2$3().curry((a: Int, b: Int) => a + b)(1)(1)

  result shouldBe  2

  }
}
