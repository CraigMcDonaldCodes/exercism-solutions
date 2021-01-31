/// Determine whether a sentence is a pangram.
use std::collections::HashSet;

pub fn is_pangram(sentence: &str) -> bool {

    // unimplemented!("Is {} a pangram?", sentence);

    let mut set = HashSet::new();

    for c in sentence.chars() {

        if c.is_ascii_alphabetic() {
            set.insert(c);
        }
    }

    // println!("{}", set.len());
    set.len() == 26
}
