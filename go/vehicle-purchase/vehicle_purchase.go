package purchase

var licensed = []string{"car", "truck"}

// NeedsLicense determines whether a license is needed to drive a type of vehicle. Only "car" and "truck" require a license.
func NeedsLicense(kind string) bool {

	// Go does not have 'contains' or 'in' etc. for array/slice membership
	for _, val := range licensed {

		if val == kind {
			return true
		}
	}

	return false
}

// ChooseVehicle recommends a vehicle for selection. It always recommends the vehicle that comes first in dictionary order.
func ChooseVehicle(option1, option2 string) string {

	better := option1

	if option2 < option1 {
		better = option2
	}

	return better + " is clearly the better choice."
}

// CalculateResellPrice calculates how much a vehicle can resell for at a certain age.
func CalculateResellPrice(originalPrice, age float64) float64 {

	var percent float64

	switch {
	case age < 3:
		percent = 0.8
	case age < 10:
		percent = 0.7
	default:
		percent = 0.5
	}

	return originalPrice * percent
}
