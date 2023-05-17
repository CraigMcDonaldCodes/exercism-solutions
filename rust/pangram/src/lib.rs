use std::collections::HashSet;

const CHAR_A: u8 = 97;
const CHAR_Z: u8 = 122;
const AZ_LEN: usize = 26;

/// Determine whether a sentence is a pangram.
pub fn is_pangram(sentence: &str) -> bool {
    let mut set = HashSet::new();
    let sentence = sentence.to_lowercase();

    for c in sentence.chars() {
        let c = c as u8;

        if c >= CHAR_A && c <= CHAR_Z {
            set.insert(c);
        }
    }

    set.len() == AZ_LEN
}
