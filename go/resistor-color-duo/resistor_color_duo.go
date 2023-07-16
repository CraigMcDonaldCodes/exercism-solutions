package resistorcolorduo

var colors = []string{
	"black",
	"brown",
	"red",
	"orange",
	"yellow",
	"green",
	"blue",
	"violet",
	"grey",
	"white",
}

// Value should return the resistance value of a resistor with a given colors.
func Value(colors []string) int {

	if len(colors) < 2 {
		panic("incorrect input, min length 2 required")
	}

	sum := colorCode(colors[0])
	sum *= 10
	sum += colorCode(colors[1])

	return sum
}

// colorCode returns the resistance value of the given color.
func colorCode(color string) int {

	for i, v := range colors {
		if color == v {
			return i
		}
	}

	panic("color value not found")
}
