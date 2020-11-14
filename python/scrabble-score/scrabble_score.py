def score(word):

    score = 0

    for w in word.upper():

        if w in ('A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'):
            score += 1
        elif w in ('D', 'G'):
            score += 2
        elif w in ('B', 'C', 'M', 'P'):
            score += 3
        elif w in ('F', 'H', 'V', 'W', 'Y'):
            score += 4
        elif w == 'K':
            score += 5
        elif w in ('J', 'X'):
            score += 8
        elif w in ('Q', 'Z'):
            score += 10

    return score

