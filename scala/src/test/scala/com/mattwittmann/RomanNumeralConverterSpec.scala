package com.mattwittmann

import org.scalatest.FunSpec

class RomanNumeralRomanNumeralConverterSpec extends FunSpec {
  describe("A RomanNumeralRomanNumeralConverter") {
    describe("when converting a number to Roman numerals") {
      it("should return I for 1") {
        assert(Some("I") === RomanNumeralConverter.toRoman(1))
      }
      it("should return III for 3") {
        assert(Some("III") === RomanNumeralConverter.toRoman(3))
      }
      it("should return V for 5") {
        assert(Some("V") === RomanNumeralConverter.toRoman(5))
      }
      it("should return VII for 7") {
        assert(Some("VII") === RomanNumeralConverter.toRoman(7))
      }
      it("should return X for 10") {
        assert(Some("X") === RomanNumeralConverter.toRoman(10))
      }
      it("should return XIII for 13") {
        assert(Some("XIII") === RomanNumeralConverter.toRoman(13))
      }
      it("should return XV for 15") {
        assert(Some("XV") === RomanNumeralConverter.toRoman(15))
      }
      it("should return L for 50") {
        assert(Some("L") === RomanNumeralConverter.toRoman(50))
      }
      it("should return C for 100") {
        assert(Some("C") === RomanNumeralConverter.toRoman(100))
      }
      it("should return D for 500") {
        assert(Some("D") === RomanNumeralConverter.toRoman(500))
      }
      it("should return M for 1000") {
        assert(Some("M") === RomanNumeralConverter.toRoman(1000))
      }
    }
    describe("when trying to convert a number outside its domain to Roman numerals") {
      it("should return None for 0") {
        assert(None === RomanNumeralConverter.toRoman(0))
      }
      it("should return None for -5") {
        assert(None === RomanNumeralConverter.toRoman(-5))
      }
    }
  }
}
