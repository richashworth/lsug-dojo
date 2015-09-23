package lsug

object LCDFormatter {
  val digitMapping = Map(
    0 -> zero,
    1 -> one,
    2 -> two,
    3 -> three,
    4 -> four,
    5 -> five,
    6 -> six,
    7 -> seven,
    8 -> eight,
    9 -> nine)

  def merge(a: LCDDigit, b: LCDDigit): LCDDigit = {
    LCDDigit(a.firstRow + " " + b.firstRow,
             a.secondRow + " " + b.secondRow,
             a.thirdRow + " " + b.thirdRow)
  }

  def parse(input: BigInt): LCDDigit = (input compare 0).signum match {
    case -1 => val message: String = s"${getClass.getName} only displays positive numbers"
               throw new IllegalArgumentException(message)
    case _  => val digits = input.toString().map(a => digitMapping(a.asDigit))
               digits.reduce((a, b) => merge(a, b))}
}

object Main {
  def main(args: Array[String]) {
    println(LCDFormatter.parse(1234567890))
  }
}
