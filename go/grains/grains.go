package grains

import (
	"errors"
	"math"
)

const MIN_SQUARES int = 1
const MAX_SQUARES int = 64

func Square(n int) (uint64, error) {

	if (n < MIN_SQUARES) || (n > MAX_SQUARES) {
		return 0, errors.New("Out of range")
	}

	return uint64(math.Pow(2.0, float64(n-1))), nil
}

func Total() uint64 {

	return (1 << 64) - 1
}

