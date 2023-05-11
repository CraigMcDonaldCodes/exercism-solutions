"""
Solution to Exercism 'flattern array' problem.
"""

from typing import List


def flatten(data: List) -> List:
    """Flatten a nested list"""

    result = []

    for item in data:
        if item is None:
            continue

        if isinstance(item, List):
            result.extend(flatten(item))
        else:
            result.append(item)

    return result
