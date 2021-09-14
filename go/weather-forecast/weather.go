// Package weather does misc. weather stuff.
// Who knows really, it's just a small problem to solve.
package weather

var (
	// Do something with the current condition
	CurrentCondition string
	// Do something with the current location
	CurrentLocation string
)

// Log - A function so simple it would never be required in a real project
func Log(city, condition string) string {
	CurrentLocation, CurrentCondition = city, condition
	return CurrentLocation + " - current weather condition: " + CurrentCondition
}
