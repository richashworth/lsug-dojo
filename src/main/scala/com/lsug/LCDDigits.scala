package com.lsug

class LCDDigit(val firstRow: String, val secondRow: String, val thirdRow: String) {}

object zero extends LCDDigit(
  firstRow  = "._.",
  secondRow = "|.|",
  thirdRow  = "|_|"
)

object one extends LCDDigit(
  firstRow  = "...",
  secondRow = "..|",
  thirdRow  = "..|"
)

object two extends LCDDigit(
  firstRow  = "._.",
  secondRow = "._|",
  thirdRow  = "|_."
)

object three extends LCDDigit(
  firstRow  = "._.",
  secondRow = "._|",
  thirdRow  = "._|"
)

object four extends LCDDigit(
  firstRow  = "...",
  secondRow = "|_|",
  thirdRow  = "..|"
)

object five extends LCDDigit(
  firstRow  = "._.",
  secondRow = "|_.",
  thirdRow  = "._|"
)

object six extends LCDDigit(
  firstRow  = "._.",
  secondRow = "|_.",
  thirdRow  = "|_|"
)

object seven extends LCDDigit(
  firstRow  = "._.",
  secondRow = "..|",
  thirdRow  = "..|"
)

object eight extends LCDDigit(
  firstRow  = "._.",
  secondRow = "|_|",
  thirdRow  = "|.|"
)

object nine extends LCDDigit(
  firstRow  = "._.",
  secondRow = "|_|",
  thirdRow  = "..|"
)

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
    val chars      = num.toString.toCharArray                     // split an Int into an array of chars
    val digits     = chars.map(i => mapping(i.asDigit)).toList    // convert this array into a list of LCDDigit objects
    val firstLine  = digits.map(_.firstRow) mkString (" ")        // construct a string of the first row
    val secondLine = digits.map(_.secondRow) mkString (" ")
    val thirdLine  = digits.map(_.thirdRow) mkString (" ")
    List(firstLine, secondLine, thirdLine) mkString "\n"          // concatenate these strings, separated with newline
  }
}

object Main {
  val lCDFormatter = new LCDFormatter

  def main(args: Array[String]): Unit = {
    println(lCDFormatter.format(214))
  }
}
