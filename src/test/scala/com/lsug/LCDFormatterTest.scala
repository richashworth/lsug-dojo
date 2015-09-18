package com.lsug

import org.scalatest.FunSuite

/**
 * Created by rich on 17/09/15.
 */
class LCDFormatterTest extends FunSuite {
  val formatter = new LCDFormatter

  test("three should be formatted correctly") {
    val THREE_AS_DIGIT = """._.
                           ^._|
                           ^._|""".stripMargin('^')
    assert(formatter.getDisplayStr(3) == THREE_AS_DIGIT)
  }

  test("ten should be formatted correctly") {
    val TEN_AS_DIGITS = """... ._.
                          ^..| |.|
                          ^..| |_|""".stripMargin('^')
    assert(formatter.getDisplayStr(10) == TEN_AS_DIGITS)
  }
}
