class BirdWatcher {

    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {

        if (birdsPerDay.length == 0) {
            return 0;
        } else {
            return birdsPerDay[birdsPerDay.length - 1];
        }
    }

    public void incrementTodaysCount() {

        if (birdsPerDay.length > 0) {
            birdsPerDay[birdsPerDay.length - 1]++;
        }
    }

    public boolean hasDayWithoutBirds() {

        boolean withoutBirds = false;

        for (int i = 0; i < birdsPerDay.length; i++) {

            if (birdsPerDay[i] == 0) {
                withoutBirds = true;
                break;
            }
        }

        return withoutBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {

        var sum = 0;

        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
            sum += birdsPerDay[i];
        }

        return sum;
    }

    public int getBusyDays() {

        var busyDays = 0;

        for (int i = 0; i < birdsPerDay.length; i++){

            if (birdsPerDay[i] >= 5) {
                busyDays++;
            }
        }

        return busyDays;
    }
}
