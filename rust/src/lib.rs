const NUMERALS: [(&'static str, i32); 7] = [("M", 1000), ("D", 500), ("C", 100), ("L", 50),
                                            ("X", 10), ("V", 5), ("I", 1)];

pub fn to_roman(number: i32) -> Option<String> {
    if number < 1 {
        None
    } else {
        Some(to_roman_in_range(number))
    }
}

fn to_roman_in_range(number: i32) -> String {
    let mut remainder = number;
    let mut result = String::new();

    for numeral_mapping in NUMERALS.into_iter() {
        remainder = handle_numeral(remainder, &mut result, &numeral_mapping);
    }

    result
}

fn handle_numeral(remainder: i32, result: &mut String, numeral_mapping: &(&'static str, i32)) -> i32 {
    let numeral = (*numeral_mapping).0;
    let value = (*numeral_mapping).1;
    let times = remainder / value;

    for _ in 0..times {
        (*result).push_str(numeral);
    }

    remainder % value
}
