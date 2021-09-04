public class CarsAssemble {

    private static final int MIN_SPEED = 0;
    private static final int MAX_SPEED = 10;
    private static final int CARS_PER_HOUR = 221;

    public double productionRatePerHour(int speed) {

        validateSpeed(speed);

        double successRate = 1.0;

        switch (speed) {

            case 5:
            case 6:
            case 7:
            case 8:
                successRate = 0.90;
                break;
            case 9:
                successRate = 0.80;
                break;
            case 10:
                successRate = 0.77;
                break;
        }

        return speed * CARS_PER_HOUR * successRate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed) / 60);
    }

    private void validateSpeed(int speed) {

        if (speed < MIN_SPEED || speed > MAX_SPEED) {
            throw new IllegalArgumentException("Invalid speed: range is 0 - 10");
        }
    }
}
