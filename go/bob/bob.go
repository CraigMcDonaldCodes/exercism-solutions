package bob

import (
	"strings"
	"unicode"
)

// Hey implements 'Bob' solution
func Hey(remark string) string {

	remark = strings.TrimSpace(remark)

	if remark == "" {
		return "Fine. Be that way!"
	}

	yell := isTextAllUpper(remark)
	question := false

	if strings.HasSuffix(remark, "?") {
		question = true
	}

	if yell && question {
		return "Calm down, I know what I'm doing!"
	}

	if yell {
		return "Whoa, chill out!"
	}

	if question {
		return "Sure."
	}

	// default value for any non-matching input
	return "Whatever."
}

func isTextAllUpper(text string) bool {

	var isLower bool
	var isUpper bool

	for _, char := range text {
		if unicode.IsLower(char) {
			isLower = true
		}

		if unicode.IsUpper(char) {
			isUpper = true
		}
	}

	return !isLower && isUpper
}
