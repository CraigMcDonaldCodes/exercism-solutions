package acronym

import (
	"regexp"
	"strings"
)

// Abbreviate return an abbreviation of the supplied words
func Abbreviate(s string) string {

	splitter := regexp.MustCompile(" |-|_")

	words := splitter.Split(s, -1)
	var sb strings.Builder

	for _, word := range words {

		if word == "" {
			continue
		}

		sb.WriteByte(word[0])
	}

	return strings.ToUpper(sb.String())
}
