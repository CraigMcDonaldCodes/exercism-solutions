package hamming

import (
	"errors"
)

func Distance(a, b string) (int, error) {

	var distance int

	aLen := len(a)
	bLen := len(b)

	if aLen != bLen {
		return distance, errors.New("lengths do not match")
	}

	for i := 0; i < aLen; i++ {

		if a[i] != b[i] {
			distance++
		}
	}

	return distance, nil
}
