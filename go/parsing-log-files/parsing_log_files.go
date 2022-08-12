package parsinglogfiles

import (
	"fmt"
	"regexp"
)

func IsValidLine(text string) bool {

	r := regexp.MustCompile(`^\[(TRC|DBG|INF|WRN|ERR|FTL)\] .*`)

	return r.MatchString(text)
}

func SplitLogLine(text string) []string {

	r := regexp.MustCompile(`<(~|\*|=|-)*?>`)

	return r.Split(text, -1)
}

func CountQuotedPasswords(lines []string) int {

	r := regexp.MustCompile(`".*?(?i)password.*?"`)
	var count int

	for _, line := range lines {
		// feels a bit ugly
		count += len(r.FindAllStringIndex(line, -1))
	}

	return count
}

func RemoveEndOfLineText(text string) string {

	// problem does not want to remove resulting extra whitespace
	r := regexp.MustCompile(`end-of-line\d+`)

	return r.ReplaceAllString(text, "")
}

func TagWithUserName(lines []string) []string {

	tagLines := make([]string, 0, len(lines))
	r := regexp.MustCompile(`User +(\w+\d+)`)

	for _, line := range lines {

		matches := r.FindStringSubmatch(line)

		if len(matches) == 2 {
			line = fmt.Sprintf("[USR] %s %s", matches[1], line)
		}

		tagLines = append(tagLines, line)
	}

	return tagLines
}
