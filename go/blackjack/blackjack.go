package blackjack

var cardValue = map[string]int{
	"ace":   11,
	"jack":  10,
	"king":  10,
	"queen": 10,
	"ten":   10,
	"nine":  9,
	"eight": 8,
	"seven": 7,
	"six":   6,
	"five":  5,
	"four":  4,
	"three": 3,
	"two":   2,
	"one":   1,
}

// ParseCard returns the integer value of a card following blackjack ruleset.
func ParseCard(card string) int {

	if value, ok := cardValue[card]; ok {
		return value
	} else {
		return 0
	}
}

// FirstTurn returns the decision for the first turn, given two cards of the
// player and one card of the dealer.
func FirstTurn(card1, card2, dealerCard string) string {

	cardSum := ParseCard(card1) + ParseCard(card2)
	dealerValue := ParseCard(dealerCard)

	// these just seem like random placements
	// logic could be cleaned up
	// just directly translated text instructions to code
	switch {
	case card1 == "ace" && card2 == "ace":
		return "P"
	case cardSum == 21 && (dealerValue < 10):
		return "W"
	case cardSum == 21 && (dealerValue >= 10):
		return "S"
	case cardSum >= 17 && cardSum <= 20:
		return "S"
	case cardSum >= 12 && cardSum <= 16 && ParseCard(dealerCard) < 7:
		return "S"
	case cardSum == 11:
		return "H"
	default:
		// hit as the default
		return "H"
	}
}
