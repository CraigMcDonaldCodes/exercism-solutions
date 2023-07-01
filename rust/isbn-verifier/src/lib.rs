// Pretty much copied as-is from my Java solution
// so not like idiomatic Rust.

/// Determines whether the supplied string is a valid ISBN number
pub fn is_valid_isbn(isbn: &str) -> bool {

    let isbn = isbn.replace("-", "").to_ascii_lowercase();

    if isbn.len() != 10 {
        return false;
    }

    let mut sum = 0i32;
    let mut count = 10i32;

    for c in isbn.chars() {
        if c.is_digit(10) {
            let digit = c.to_digit(10).expect("invalid data supplied") as i32;
            sum += digit * count;
        } else if c == 'x' && count == 1 {
            sum += 10;
        } else {
            sum = -1;
            break;
        }

        count -= 1;
    }

    sum % 11 == 0
}
