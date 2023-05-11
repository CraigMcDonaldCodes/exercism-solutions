"""
Solution to Exercism 'bob' problem.

Copied (mostly) from my Java solution.
"""


def response(hey_bob: str) -> str:
    """
    Bob is a lackadaisical teenager and responds as such.
    """

    hey_bob = hey_bob.strip()

    # First check is nothing is said
    if hey_bob == "":
        return "Fine. Be that way!"

    yell = hey_bob.isupper()
    question = False

    if hey_bob.endswith("?"):
        question = True

    if yell and question:
        return "Calm down, I know what I'm doing!"

    if yell:
        return "Whoa, chill out!"

    if question:
        return "Sure."

    # default value for any non-matching input
    return "Whatever."
