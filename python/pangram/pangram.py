"""
Solution to Exercism 'Pangram' problem
"""


def is_pangram(sentence: str) -> bool:
    """Determine if supplied str is a pangram"""

    letters = set("abcdefghijklmnopqrstuvwxyz")
    sentence = sentence.lower()

    for char in sentence:
        if char in letters:
            letters.remove(char)

    return len(letters) == 0
