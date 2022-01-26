public class ElonsToyCar {

    private static int EMPTY = 0;
    private static int DISTANCE = 20;

    private int metersDriven;
    private int batteryPecentage = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", metersDriven);
    }

    public String batteryDisplay() {

        if (batteryPecentage == EMPTY) {
            return "Battery empty";
        } else {
            return String.format("Battery at %d%%", batteryPecentage);
        }
    }

    public void drive() {

        if (batteryPecentage > EMPTY) {

            batteryPecentage--;
            metersDriven += DISTANCE;
        }
    }
}
