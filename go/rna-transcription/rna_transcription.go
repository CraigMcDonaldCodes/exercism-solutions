package strand

import "strings"

var mapping = map[rune]rune{
	'G': 'C',
	'C': 'G',
	'T': 'A',
	'A': 'U',
}

// ToRNA convert a DNA strand into its RNA complement
func ToRNA(dna string) string {

	var sb strings.Builder

	for _, r := range dna {

		if val, ok := mapping[r]; ok {
			sb.WriteRune(val)
		}
	}

	return sb.String()
}
