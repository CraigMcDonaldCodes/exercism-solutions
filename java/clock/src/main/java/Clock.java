public class Clock {

    private int hour;
    private int minute;

    public Clock() {
        this(0,0);
    }

    public Clock(int hour, int minute) {

        // TODO Will need to validate these inputs
        this.hour = hour;
        this.minute = minute;
    }


    public void add(int value) {
    }

    public String toString() {
        return String.format("%02d:%2d", hour, minute);
    }
}
