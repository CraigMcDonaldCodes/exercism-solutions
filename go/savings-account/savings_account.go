package savings

const fixedInterestRate = 0.05
const daysPerYear = 365

const (
	Jan = iota
	Feb
	Mar
	Apr
	May
	Jun
	Jul
	Aug
	Sep
	Oct
	Nov
	Dec
)

// GetFixedInterestRate returns the FixedInterestRate constant
func GetFixedInterestRate() float32 {
	return fixedInterestRate
}

// GetDaysPerYear returns the DaysPerYear constant
func GetDaysPerYear() int {
	return daysPerYear
}

// GetMonth returns the value for the given month
func GetMonth(month int) int {
	return month + 1
}

// AccNo type for a string - this is a stub type included to demonstrate how the untyped string constant can be used where this type is required
type AccNo string

// GetAccountNumber returns the AccountNo constant
func GetAccountNumber() AccNo {
	return AccNo("XF348IJ")
}
