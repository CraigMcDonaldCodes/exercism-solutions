package luhn

import (
	"strings"
)

const (
	minLength = 2
	maxValue  = 9
	asciiZero = 48
)

func Valid(id string) bool {

	id = strings.ReplaceAll(id, " ", "")

	if len(id) < minLength {
		return false
	}

	var (
		sum        int
		mustDouble bool
	)

	for i := len(id) - 1; i >= 0; i-- {

		// convert to what should be 0 - 9 value
		value := int(id[i]) - asciiZero

		// check value is within range
		if value < 0 || value > 9 {
			return false
		}

		if mustDouble {
			value *= 2

			if value > maxValue {
				value -= maxValue
			}

			mustDouble = false
		} else {
			mustDouble = true
		}

		sum += value
	}

	return sum%10 == 0
}
