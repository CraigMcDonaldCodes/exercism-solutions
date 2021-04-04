package darts

import "math"

const (
	noScore     = 0
	outerScore  = 1
	middleScore = 5
	innerScore  = 10
)

func Score(x, y float64) int {

	radius := math.Sqrt(x*x + y*y)
	var score int

	switch {
	case radius > 10:
		score = noScore
	case radius > 5:
		score = outerScore
	case radius > 1:
		score = middleScore
	case radius >= 0:
		score = innerScore
	default:
		score = noScore
	}

	return score
}
