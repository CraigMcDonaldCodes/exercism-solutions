package lasagna

const noodlesPerLayer = 50
const saucePerLayer = 0.2

// PreparationTime estimate for the total preparation time based on the number of layers and time per layer
func PreparationTime(layers []string, time int) int {

	if time < 1 {
		time = 2
	}

	return len(layers) * time
}

// Quantities determine the quantity of noodles and sauce needed
func Quantities(layers []string) (int, float64) {

	var noodleCount int
	var sauceCount int

	for _, val := range layers {

		if val == "noodles" {
			noodleCount++
		}

		if val == "sauce" {
			sauceCount++
		}
	}

	noodles := noodleCount * noodlesPerLayer
	sauce := float64(sauceCount) * saucePerLayer

	return noodles, sauce
}

// AddSecretIngredient
func AddSecretIngredient(friendsList []string, myList []string) {

	secret := friendsList[len(friendsList)-1]
	myList[len(myList)-1] = secret
}

// ScaleRecipe
func ScaleRecipe(quantities []float64, portions int) []float64 {

	scale := float64(portions) / 2.0
	newQuantities := make([]float64, len(quantities))

	for idx, _ := range newQuantities {
		newQuantities[idx] = quantities[idx] * float64(scale)
	}

	return newQuantities
}
