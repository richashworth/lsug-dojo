package lsug

/**
 * Created by rich on 17/09/15.
 */
case class LCDDigit(val firstRow: String, val secondRow: String, val thirdRow: String) {
  override def toString: String = {
    productIterator mkString "\n"
  }
}

object zero extends LCDDigit(
  "._.",
  "|.|",
  "|_|"
)

object one extends LCDDigit(
  "...",
  "..|",
  "..|"
)

object two extends LCDDigit(
  "._.",
  "._|",
  "|_."
)

object three extends LCDDigit(
  "._.",
  "._|",
  "._|"
)

object four extends LCDDigit(
  "...",
  "|_|",
  "..|"
)

object five extends LCDDigit(
  "._.",
  "|_.",
  "._|"
)

object six extends LCDDigit(
  "._.",
  "|_.",
  "|_|"
)

object seven extends LCDDigit(
  "._.",
  "..|",
  "..|"
)

object eight extends LCDDigit(
  "._.",
  "|_|",
  "|_|"
)

object nine extends LCDDigit(
  "._.",
  "|_|",
  "..|"
)

object empty extends LCDDigit(
  "",
  "",
  ""
)
