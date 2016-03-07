extern crate roman_numeral_code_kata_rust;

#[cfg(test)]
mod tests {
    use roman_numeral_code_kata_rust::to_roman;

    #[test]
    fn to_roman_takes_1_and_returns_i() {
        assert_eq!(Some("I".to_owned()), to_roman(1));
    }

    #[test]
    fn to_roman_takes_3_and_returns_iii() {
        assert_eq!(Some("III".to_owned()), to_roman(3));
    }

    #[test]
    fn to_roman_takes_3_and_returns_v() {
        assert_eq!(Some("V".to_owned()), to_roman(5));
    }

    #[test]
    fn to_roman_takes_7_and_returns_vii() {
        assert_eq!(Some("VII".to_owned()), to_roman(7));
    }

    #[test]
    fn to_roman_takes_10_and_returns_x() {
        assert_eq!(Some("X".to_owned()), to_roman(10));
    }

    #[test]
    fn to_roman_takes_13_and_returns_xiii() {
        assert_eq!(Some("XIII".to_owned()), to_roman(13));
    }

    #[test]
    fn to_roman_takes_15_and_returns_xv() {
        assert_eq!(Some("XV".to_owned()), to_roman(15));
    }

    #[test]
    fn to_roman_takes_50_and_returns_l() {
        assert_eq!(Some("L".to_owned()), to_roman(50));
    }

    #[test]
    fn to_roman_takes_100_and_returns_c() {
        assert_eq!(Some("C".to_owned()), to_roman(100));
    }

    #[test]
    fn to_roman_takes_1000_and_returns_m() {
        assert_eq!(Some("M".to_owned()), to_roman(1000));
    }

    #[test]
    fn to_roman_takes_0_and_returns_none() {
        assert_eq!(None, to_roman(0));
    }

    #[test]
    fn to_roman_takes_neg_5_and_returns_none() {
        assert_eq!(None, to_roman(-5));
    }
}
