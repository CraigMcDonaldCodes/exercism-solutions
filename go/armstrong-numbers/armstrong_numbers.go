package armstrong

import (
	"math"
	"strconv"
)

func IsNumber(n int) bool {

	power := float64(len(strconv.Itoa(n)))
	current := n
	var sum float64

	for current > 0 {
		t := float64(current % 10)
		sum += math.Pow(t, power)
		current /= 10
	}

	return float64(n) == sum
}
