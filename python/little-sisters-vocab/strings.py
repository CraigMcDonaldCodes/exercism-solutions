"""Functions for creating, transforming, and adding prefixes to strings."""


def add_prefix_un(word):
    """Take the given word and add the 'un' prefix.

    :param word: str - containing the root word.
    :return: str - of root word prepended with 'un'.
    """

    return f"un{word}"


def make_word_groups(vocab_words):
    """Transform a list containing a prefix and words into a string.

    :param vocab_words: list - of vocabulary words with prefix in first index.
    :return: str - of prefix followed by vocabulary words with
            prefix applied.

    This function takes a `vocab_words` list and returns a string
    with the prefix and the words with prefix applied, separated
     by ' :: '.

    For example: list('en', 'close', 'joy', 'lighten'),
    produces the following string: 'en :: enclose :: enjoy :: enlighten'.
    """

    length = len(vocab_words)
    answer: str = ""

    if length == 1:
        answer = vocab_words[0]
    elif length > 1:
        prefix = vocab_words[0]
        results = []
        results.append(prefix)

        for word in vocab_words[1:]:
            results.append(prefix + word)

        answer = " :: ".join(results)

    return answer


def remove_suffix_ness(word):
    """Remove the suffix from the word while keeping spelling in mind.

    :param word: str - of word to remove suffix from.
    :return: str - of word with suffix removed & spelling adjusted.

    For example: "heaviness" becomes "heavy", but "sadness" becomes "sad".
    """

    answer: str = word

    if word.endswith("ness"):
        if word[-5] == "i":
            answer = word[:-5]
            answer = answer + "y"
        else:
            answer = word[:-4]

    return answer


def adjective_to_verb(sentence, index):
    """Change the adjective within the sentence to a verb.

    :param sentence: str - that uses the word in sentence.
    :param index: int - index of the word to remove and transform.
    :return: str - word that changes the extracted adjective to a verb.

    For example, ("It got dark as the sun set", 2) becomes "darken".
    """

    # assuming the index supplied is valid for the string
    # and it's a sentence ending in a full stop
    return f'{sentence[:-1].split(" ")[index]}en'
