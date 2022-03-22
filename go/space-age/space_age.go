package space

const (
	earthSeconds = 31_557_600
	mercury      = 0.2_408_467
	venus        = 0.61_519_726
	mars         = 1.8_808_158
	jupiter      = 11.8_626_15
	saturn       = 29.447_498
	uranus       = 84.016_846
	neptune      = 164.79_132
)

type Planet string

func Age(seconds float64, planet Planet) float64 {

	age := seconds / earthSeconds

	switch planet {
	case "Earth":
		break
	case "Mercury":
		age /= mercury
	case "Venus":
		age /= venus
	case "Mars":
		age /= mars
	case "Jupiter":
		age /= jupiter
	case "Saturn":
		age /= saturn
	case "Uranus":
		age /= uranus
	case "Neptune":
		age /= neptune
	default:
		panic("no valid Planet supplied")
	}

	return age
}
