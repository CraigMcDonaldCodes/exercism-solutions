package isogram

import "strings"

// IsIsogram determines if a string is an isogram
// i.e. no repeating letters
func IsIsogram(word string) bool {

	runes := make([]bool, 26)
	result := true
	word = strings.ToLower(word)

	for _, r := range word {

		if r == ' ' || r == '-' {
			continue
		}

		pos := int(r) - 97

		if runes[pos] {
			result = false
			break
		}

		runes[pos] = true
	}

	return result
}
