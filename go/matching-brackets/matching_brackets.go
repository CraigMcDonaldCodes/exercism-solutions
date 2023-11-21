package brackets

var closingRune = map[rune]rune{
	']': '[',
	'}': '{',
	')': '(',
}

func Bracket(input string) bool {

	// no built in 'stack' data structure ☹️
	// so we half-arse it
	var stack []rune

	for _, r := range input {
		switch r {

		case '[', '{', '(':
			stack = append(stack, r)
		case ']', '}', ')':
			top := len(stack) - 1

			if len(stack) > 0 && (stack[top] == closingRune[r]) {
				stack = stack[:top]
			} else {
				return false
			}
		}
	}

	return len(stack) == 0
}
