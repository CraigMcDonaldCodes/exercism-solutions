// This was a straight port of my Java solution.
// Probably could be more idiomatic Rust.

pub fn reply(message: &str) -> &str {

    let message = message.trim();

    if message.is_empty() {
        return "Fine. Be that way!";
    }

    let yell = is_text_all_upper(message);
    let mut question = false;

    if message.ends_with('?') {
        question = true;
    }

    if yell && question {
        return "Calm down, I know what I'm doing!";
    }

    if yell {
        return "Whoa, chill out!";
    }

    if question {
        return "Sure.";
    }

    // Default value for any non-matching input
    "Whatever."
}

fn is_text_all_upper(text: &str) -> bool {

    let mut is_lower = false;
    let mut is_upper = false;

    for c in text.chars() {
        if c.is_uppercase() { is_upper = true; }
        if c.is_lowercase() { is_lower = true; }
    }

    !is_lower && is_upper
}
