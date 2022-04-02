package robotname

import (
	"math/rand"
	"strings"
	"time"
)

var robots = make(map[string]bool)

func init() {
	rand.Seed(time.Now().UnixNano())
}

func nextName() string {

	// does not take into account running out of names!
	// max: 26^2 * 10^3

	var sb strings.Builder
	var name string

	for {
		// two uppercase
		sb.WriteRune(rune(rand.Intn(26) + 65))
		sb.WriteRune(rune(rand.Intn(26) + 65))

		// three numbers
		sb.WriteRune(rune(rand.Intn(10) + 48))
		sb.WriteRune(rune(rand.Intn(10) + 48))
		sb.WriteRune(rune(rand.Intn(10) + 48))

		name = sb.String()

		if _, found := robots[name]; !found {

			robots[name] = true
			break
		}

		sb.Reset()
	}

	return name
}

// A Robot represents a very simple robot that doesn't do anything
// other than know its name
type Robot struct {
	name string
}

// Name returns the name of a robot
func (r *Robot) Name() (string, error) {

	if r.name == "" {
		r.Reset()
	}

	// no idea why the return type includes 'error'
	// all tests passes
	return r.name, nil
}

// Reset assigns a new robot name
func (r *Robot) Reset() {
	r.name = nextName()
}
