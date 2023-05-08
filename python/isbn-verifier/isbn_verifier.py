"""
Solution to Exercism 'ISBN Verifier'

Port of Java solution might not be 'Pythonic'
"""

REQ_LENGTH: int = 10
BIT_CHECK: int = 11

def is_valid(isbn):
    """Validate ISBN number"""

    isbn = isbn.replace("-", "").lower()

    if len(isbn) != REQ_LENGTH:
        return False

    total: int = 0
    count: int = REQ_LENGTH

    for value in isbn:
        if value.isdigit():
            total += int(value) * count
        elif value  == 'x' and count == 1:
            total += 10
        else:
            total = -1
            break

        count -= 1

    return total % BIT_CHECK == 0
