package lsug

import org.scalatest.FunSuite

/**
 * Created by rich on 17/09/15.
 */
class LCDFormatterTest extends FunSuite {

  test("three should be formatted correctly") {
    val LCD_THREE = """._.
                      ^._|
                      ^._|""".stripMargin('^')
    assert(LCDFormatter.parse(3).toString == LCD_THREE)
  }

  test("ten should be formatted correctly") {
    val LCD_TEN = """... ._.
                    ^..| |.|
                    ^..| |_|""".stripMargin('^')
    assert(LCDFormatter.parse(10).toString == LCD_TEN)
  }

  test("negative inputs should throw an exception") {
    intercept[IllegalArgumentException]{
      LCDFormatter.parse(-1)
    }
  }
}
