package isbn

import (
	"strings"
	"unicode"
)

const isbnLength = 10

func IsValidISBN(isbn string) bool {

	isbn = strings.ReplaceAll(isbn, "-", "")
	isbn = strings.ToLower(isbn)

	if len(isbn) != isbnLength {
		return false
	}

	sum := 0
	count := isbnLength

	for _, val := range isbn {

		if unicode.IsNumber(val) {
			sum += int(val-'0') * count
		} else if val == 'x' && count == 1 {
			sum += 10
		} else {
			// invalid character, set bad value and return early
			sum = -1
			break
		}

		count--
	}

	return sum%11 == 0
}
