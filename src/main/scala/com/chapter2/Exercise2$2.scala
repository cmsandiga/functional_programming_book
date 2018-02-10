package com.chapter2

import scala.annotation.tailrec

class Exercise2$2 {


  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {

    @tailrec
    def loop(a: Int): Boolean = {
      if (a >= as.length - 1) true
      else if (ordered(as(a), as(a + 1))) loop(a + 1)
      else false
    }

    loop(0)
  }


}
