package diffsquares

import "math"

func SquareOfSum(max int) int {

	var sum int

	for i := 1; i <= max; i++ {
		sum += i
	}

	return powTwoInt(sum)
}

func SumOfSquares(max int) int {
	var sum int

	for i := 1; i <= max; i++ {
		sum += powTwoInt(i)
	}

	return sum
}

func Difference(max int) int {
	return SquareOfSum(max) - SumOfSquares(max)
}

func powTwoInt(n int) int {
	return int(math.Pow(float64(n), 2))
}
