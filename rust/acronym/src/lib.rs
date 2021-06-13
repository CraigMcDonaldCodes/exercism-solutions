pub fn abbreviate(phrase: &str) -> String {
    if phrase.is_empty() {
        return String::from(phrase);
    }

    let clean_phrase = phrase.replace("-", " ").replace("_", " ");
    let words = clean_phrase.split(" ");
    let mut acronym = String::from("");

    for w in words {
        acronym.push(w.chars().nth(0).unwrap());
    }

    acronym.to_uppercase()
}
