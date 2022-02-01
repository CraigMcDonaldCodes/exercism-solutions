class NeedForSpeed {

    private static final int MIN_BATTERY = 0;
    private static final int MAX_BATTERY = 100;

    private static final int NITRO_DRAIN = 4;
    private static final int NITRO_SPEED = 50;

    private int distance;
    private int speed;
    private int batteryDrain;
    private int batteryStatus;

    public NeedForSpeed(int speed, int batteryDrain) {

        this.speed = speed;
        this.batteryDrain = batteryDrain;
        batteryStatus = MAX_BATTERY;
    }

    public boolean batteryDrained() {
        return batteryStatus == MIN_BATTERY;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {

        if (batteryStatus >= batteryDrain) {

            batteryStatus -= batteryDrain;
            distance += speed;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(NITRO_SPEED, NITRO_DRAIN);
    }
}

class RaceTrack {

    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean carCanFinish(NeedForSpeed car) {

        while (!car.batteryDrained()) {
            car.drive();
        }

        return car.distanceDriven() >= distance;
    }
}
