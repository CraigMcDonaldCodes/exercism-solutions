package thefarm

import (
	"errors"
	"fmt"
)

// SillyNephewError
type SillyNephewError struct {
	cows int
}

func (s SillyNephewError) Error() string {
	return fmt.Sprintf("silly nephew, there cannot be %d cows", s.cows)
}

// DivideFood computes the fodder amount per cow for the given cows.
func DivideFood(weightFodder WeightFodder, cows int) (float64, error) {

	// I don't think this is handling all issues or handling them in the best order
	// to reduce complexity
	// but all tests are passing so
	// ¯\_(ツ)_/¯

	if cows < 0 {
		return 0.0, SillyNephewError{cows}
	}

	if cows == 0 {
		return 0.0, errors.New("division by zero")
	}

	weight, err := weightFodder.FodderAmount()

	if err == nil {

		if weight < 0 {
			return 0.0, errors.New("negative fodder")
		}

		return weight / float64(cows), nil
	} else {

		if err == ErrScaleMalfunction {

			if weight >= 0 {
				return weight * 2.0 / float64(cows), nil
			} else {
				return 0.0, errors.New("negative fodder")
			}
		}

		return 0.0, err
	}
}
