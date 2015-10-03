package lsug

/**
 * Created by rich on 17/09/15.
 */
case class LCDDisplay(firstRow: String, secondRow: String, thirdRow: String) {
  override def toString: String = {
    productIterator mkString "\n"
  }
}

object zero extends LCDDisplay(
  "._.",
  "|.|",
  "|_|"
)
object one extends LCDDisplay("...", "..|", "..|")
object two extends LCDDisplay("._.", "._|", "|_.")
object three extends LCDDisplay("._.", "._|", "._|")
object four extends LCDDisplay("...", "|_|", "..|")
object five extends LCDDisplay("._.", "|_.", "._|")
object six extends LCDDisplay("._.", "|_.", "|_|")
object seven extends LCDDisplay("._.", "..|", "..|")
object eight extends LCDDisplay("._.", "|_|", "|_|")
object nine extends LCDDisplay("._.", "|_|", "..|")