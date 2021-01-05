package leap

// IsLeapYear Determine if year is leap
func IsLeapYear(year int) bool {

	isLeap := (year%4 == 0 && year%100 != 0) || year%400 == 0

	return isLeap
}
