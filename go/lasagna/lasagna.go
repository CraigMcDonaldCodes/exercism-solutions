package lasagna

const cookingTime = 40
const minutesPerLayer = 2

// TODO: define the 'OvenTime()' function
func OvenTime() int {
	return cookingTime
}

// TODO: define the 'RemainingOvenTime()' function
func RemainingOvenTime(time int) int {
	return cookingTime - time
}

// TODO: define the 'PreparationTime()' function
func PreparationTime(layers int) int {
	return minutesPerLayer * layers
}

// TODO: define the 'ElapsedTime()' function
func ElapsedTime(layers, time int) int {
	return time + PreparationTime(layers)
}
