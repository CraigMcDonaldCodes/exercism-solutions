__MIN = 1
__MAX = 64
__TOTAL = (2 << 63) - 1


def square(number):

    if number < __MIN or number > __MAX:
        raise ValueError("Value out of range")

    return 2 ** (number - 1)


def total():
    return __TOTAL
