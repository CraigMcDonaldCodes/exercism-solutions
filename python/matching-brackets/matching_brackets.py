closingChar = {
    ']': '[',
    '}': '{',
    ')': '('
}

def is_paired(input_string):

    stack = []

    for c in input_string:
        
