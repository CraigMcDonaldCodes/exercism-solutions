package pangram

import (
	"unicode"
)

// Determine if a string contains all letters of the alphabet
func IsPangram(input string) bool {

	set := make(map[rune]bool)

	for _, item := range input {

		item = unicode.ToLower(item)

		if !unicode.IsLetter(item) {
			continue
		}

		if _, ok := set[item]; !ok {
			set[item] = true
		}
	}

	return len(set) == 26
}
