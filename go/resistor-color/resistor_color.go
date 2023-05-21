package resistorcolor

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

// Colors should return the list of all colors.
func Colors() []string {

	colorsCopy := make([]string, len(colors))
	copy(colorsCopy, colors)

	return colorsCopy
}

// ColorCode returns the resistance value of the given color.
func ColorCode(color string) int {

	for i, v := range colors {
		if color == v {
			return i
		}
	}

	panic("value not found")
}
