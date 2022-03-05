package logs

import (
	"strings"
	"unicode/utf8"
)

// Application identifies the application emitting the given log.
func Application(log string) string {

	appName := "default"

Loop:
	for _, val := range log {

		switch val {
		case '❗':
			appName = "recommendation"
			break Loop
		case '🔍':
			appName = "search"
			break Loop
		case '☀':
			appName = "weather"
			break Loop
		}
	}

	return appName
}

// Replace replaces all occurrences of old with new, returning the modified log
// to the caller.
func Replace(log string, oldRune, newRune rune) string {

	find := string(oldRune)
	replace := string(newRune)

	newLog := strings.ReplaceAll(log, find, replace)

	return newLog
}

// WithinLimit determines whether or not the number of characters in log is
// within the limit.
func WithinLimit(log string, limit int) bool {
	return utf8.RuneCount([]byte(log)) <= limit
}
