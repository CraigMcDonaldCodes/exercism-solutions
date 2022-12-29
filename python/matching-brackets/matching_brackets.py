"""Module provides ability to match closing brackets"""

closing_char = {"]": "[", "}": "{", ")": "("}


def is_paired(input_string):
    """Return bool if brackets are matching.

    :param input_string: str - The text that need checking.
    """

    stack = []

    for char in input_string:
        match char:
            case "[" | "{" | "(":
                stack.append(char)
            case "]" | "}" | ")":
                if (len(stack) > 0) and (stack[-1] == closing_char.get(char)):
                    stack.pop()
                else:
                    return False

    return len(stack) == 0
