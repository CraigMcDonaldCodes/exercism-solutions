def flatten(iterable):

    data = []

    for i in iterable:
        if type(i) == 'list':
            data.append(flatten(i))
        else:
            data.append(i)

    return data

