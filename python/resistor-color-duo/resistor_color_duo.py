all_colors = [
    "black",
    "brown",
    "red",
    "orange",
    "yellow",
    "green",
    "blue",
    "violet",
    "grey",
    "white"
]

def value(colors):

    if len(colors) < 2:
        raise ValueError("Must supply two values.")

    total = 0

    for i in range(2):

        total *= 10

        if colors[i] in all_colors:
            total += all_colors.index(colors[i])
        else:
            raise ValueError("{} is not a valid color".format(colors[i]))


    return total

