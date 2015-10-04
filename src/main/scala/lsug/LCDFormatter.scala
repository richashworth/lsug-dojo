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

  val invalidInputMsg = s"${getClass.getName} only displays positive numbers"

  def merge(a: LCDDisplay, b: LCDDisplay): LCDDisplay = {
    LCDDisplay(a.firstRow  + " " + b.firstRow,
               a.secondRow + " " + b.secondRow,
               a.thirdRow  + " " + b.thirdRow)
  }

  def parse(input: BigInt): LCDDisplay = (input compare 0).signum match {
    case -1 => throw new IllegalArgumentException(invalidInputMsg)
    case _ => input.toString().map(a => digitMapping(a.asDigit)).reduce((a, b) => merge(a, b))
//    case _ => input.toString().par.map(a => digitMapping(a.asDigit)).reduce((a, b) => merge(a, b))
  }

  def format(input: BigInt) = parse(input).toString
}

object Main extends App {
  args.foreach(i => (println(LCDFormatter.format(BigInt(i)))))
}
