public class ExperimentalRemoteControlCar implements RemoteControlCar {

    private static final int DISTANCE_INC = 20;

    private int distance;

    public void drive() {
        distance += DISTANCE_INC;
    }

    public int getDistanceTravelled() {
        return distance;
    }
}
