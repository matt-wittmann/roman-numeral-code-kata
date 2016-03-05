package com.mattwittmann

/**
  * Converts between integers within range and Roman numerals.
  */
object RomanNumeralConverter {
  val numerals = List(("M", 1000), ("D", 500), ("C", 100), ("L", 50), ("X", 10), ("V", 5), ("I", 1))

  /**
    * Converts from integers to Roman numerals.
    *
    * @param number An integer to be converted to Roman numerals
    * @return Either the number in Roman numerals or `None` if the number is out of range
    */
  def toRoman(number: Int): Option[String] = number match {
    case x if x < 1 => None
    case x => Some(toRomanInRange(x))
  }

  /**
    * Converts from integers to Roman numerals, assuming the number is in range.
    *
    * TODO Subtractive notation needs to be handled.
    *
    * @param number The number, assumed to be in range
    * @return The number in Roman numerals
    */
  private def toRomanInRange(number: Int): String = {
    ((("", number)) /: numerals) {
      case ((result, remainder), (numeral, value)) =>
        val times = remainder / value
        val substituteSymbol = (x: Int) => numeral
        val numeralsToAppend = (1 to times).map(substituteSymbol).mkString("")
        val newRemainder = remainder % value
        (result + numeralsToAppend, newRemainder)
    }._1
  }
}
