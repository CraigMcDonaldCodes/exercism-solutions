use std::collections::HashMap;

pub fn brackets_are_balanced(string: &str) -> bool {

    let closing_char: HashMap<char, char> = HashMap::from([
        (')','('),
        (']','['),
        ('}','{'),
    ]);

    let mut stack = Vec::new();

    for c in string.chars() {

        match c {
            '(' | '[' | '{' => stack.push(c),
            ')' | ']' | '}' => {
                if stack.len() > 0 && (stack.last() == closing_char.get(&c)) {
                    stack.pop();
                } else {
                    return false
                }
            },
            _ => (),
        }
    }

    stack.len() == 0
}
