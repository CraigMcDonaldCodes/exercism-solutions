// Follow validation rules based on:
// https://en.wikipedia.org/wiki/Luhn_algorithm

/// Check a Luhn checksum.
pub fn is_valid(code: &str) -> bool {

    let min_length = 2u32;
    let max_value = 9u32;

    let code = code.replace(" ", "");

    if code.len() < min_length as usize{
        return false
    }

    let mut sum = 0;
    let mut must_double = false;

    // this is defo not correct for all unicode input
    // it does pass all supplied tests ;)
    for c in code.chars().rev() {

        if !c.is_digit(10) {
            return false;
        }

        let mut value = c.to_digit(10).expect("incorrect data supplied");

        if must_double {

            value *= 2;

            if value > max_value {
                value -= max_value;
            }

            must_double = false;
        } else {
            must_double = true;
        }

        sum += value;
    }


    sum % 10 == 0
}
