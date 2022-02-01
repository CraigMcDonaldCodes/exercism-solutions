class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    private static final int DISTANCE_INC = 10;

    private int distance;
    private int victories;

    public void drive() {
        distance += DISTANCE_INC;
    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberofVictories) {
        victories = numberofVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar car) {

        return getDistanceTravelled() - car.getNumberOfVictories();
    }
}
