package com.lsug

import scala.collection.immutable.IndexedSeq

class LCDFormatter(){
  val mapping = Map(
    0 -> zero,
    1 -> one,
    2 -> two,
    3 -> three,
    4 -> four,
    5 -> five,
    6 -> six,
    7 -> seven,
    8 -> eight,
    9 -> nine
  )

  def format(num: Int) = {
    val digits: Seq[LCDDigit] = num.toString.map(i => mapping(i.asDigit)) // construct a sequence of LCDDigits
    val firstLine  = digits.map(_.firstRow) mkString " "                  // construct a string of each row
    val secondLine = digits.map(_.secondRow) mkString " "
    val thirdLine  = digits.map(_.thirdRow) mkString " "
    List(firstLine, secondLine, thirdLine) mkString "\n"                  // build the result from each row
  }
}

object Main {
  val lCDFormatter = new LCDFormatter

  def main(args: Array[String]): Unit = {
    println(lCDFormatter.format(214))
  }
}
