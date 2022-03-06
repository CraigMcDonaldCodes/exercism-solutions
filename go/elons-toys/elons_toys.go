package elon

import "fmt"

// Drive updates the number of meters driven based on the car's speed, and reduces the battery according to the battery drainage
func (car *Car) Drive() {

	if car.battery >= car.batteryDrain {
		car.battery -= car.batteryDrain
		car.distance += car.speed
	}
}

// DisplayDistance return the distance as displayed on the LED display
func (car Car) DisplayDistance() string {
	return fmt.Sprintf("Driven %d meters", car.distance)
}

// DisplayBattery return the battery percentage as displayed on the LED display
func (car Car) DisplayBattery() string {
	return fmt.Sprintf("Battery at %d%%", car.battery)
}

// CanFinish determine if car can drive track length
func (car Car) CanFinish(trackDistance int) bool {

	return (car.distance + ((car.battery / car.batteryDrain) * car.speed)) >= trackDistance
}
