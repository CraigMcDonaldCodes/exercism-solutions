package lasagna

const cookingTime = 40
const minutesPerLayer = 2

func OvenTime() int {
	return cookingTime
}

func RemainingOvenTime(time int) int {
	return cookingTime - time
}

func PreparationTime(layers int) int {
	return minutesPerLayer * layers
}

func ElapsedTime(layers, time int) int {
	return time + PreparationTime(layers)
}
