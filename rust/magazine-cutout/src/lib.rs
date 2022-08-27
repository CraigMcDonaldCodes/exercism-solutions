// this is probably not idiomatic Rust, still learning

use std::collections::HashMap;

pub fn can_construct_note(magazine: &[&str], note: &[&str]) -> bool {

    let mut required: HashMap<&str, u32> = HashMap::new();

    for &n in note {
        required.entry(n)
                .and_modify(|e| *e += 1)
                .or_insert(1);
    }

    for &m in magazine {
        if required.contains_key(m) {
            if required[m] == 1 {
                required.remove(m);
            } else {
                required.entry(m).and_modify(|e| *e -= 1);
            }
        }
    }

    required.keys().len() == 0
}
