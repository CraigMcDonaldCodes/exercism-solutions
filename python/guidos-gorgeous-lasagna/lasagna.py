"""Guidos Gorgeous Lasagna Problem Solution"""

EXPECTED_BAKE_TIME = 40
MINUTES_PER_LAYER = 2

def bake_time_remaining(elapsed_bake_time):
    """Calculate the bake time remaining.

    :param elapsed_bake_time: int baking time already elapsed.
    :return: int remaining bake time derived from 'EXPECTED_BAKE_TIME'.

    Function that takes the actual minutes the lasagna has been in the oven as
    an argument and returns how many minutes the lasagna still needs to bake
    based on the `EXPECTED_BAKE_TIME`.
    """

    return EXPECTED_BAKE_TIME - elapsed_bake_time


def preparation_time_in_minutes(layers):
    """Calculate preparation time based on layers required.
    
    :param layers: int number of layers needed
    :return: int time in minutes
    """

    return MINUTES_PER_LAYER * layers


def elapsed_time_in_minutes(layers, time):
    """Return elapsed cooking time.

    :param layers: int number of lasagna layers
    :param time: int time already baked for
    :return int

    This function takes two numbers representing the number of layers & the time already spent
    baking and calculates the total elapsed minutes spent cooking the lasagna.
    """

    return time + preparation_time_in_minutes(layers)
