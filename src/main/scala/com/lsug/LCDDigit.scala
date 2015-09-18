package com.lsug

/**
 * Created by rich on 17/09/15.
 */
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
  thirdRow  = "|_|"
)

object nine extends LCDDigit(
  firstRow  = "._.",
  secondRow = "|_|",
  thirdRow  = "..|"
)
