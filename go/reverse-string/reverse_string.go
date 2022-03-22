package reverse

import "strings"

func Reverse(input string) string {

	var sb strings.Builder
	runes := make([]rune, 0)

	// unwind the unicode string into a slice of runes
	for _, s := range input {
		runes = append(runes, s)
	}

	// build a new string, from the back of the slice
	for i := len(runes) - 1; i >= 0; i-- {
		sb.WriteRune(runes[i])
	}

	return sb.String()
}
