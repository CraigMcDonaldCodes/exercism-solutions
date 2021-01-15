public class Clock {

    private static final int MAX_MIN = 60;
    private static final int MAX_HOUR = 24;

    private int hour;
    private int minute;

    ////////////////////////////////////////////////////////////////////////////////
    public Clock() {
        this(0,0);
    }

    ////////////////////////////////////////////////////////////////////////////////
    public Clock(int hour, int minute) {

        this.hour = hour;
        this.minute = minute;
        rollUp();
    }

    ////////////////////////////////////////////////////////////////////////////////
    public void add(int value) {

        minute += value;
        rollUp();
    }

    ////////////////////////////////////////////////////////////////////////////////
    private void rollUp() {

        if (minute >= MAX_MIN) {
            hour += minute / MAX_MIN;
            minute %= MAX_MIN;
        }

        if (hour >= MAX_HOUR) {
            hour %= MAX_HOUR;
        }
    }

    ////////////////////////////////////////////////////////////////////////////////
    @Override
    public boolean equals(Object object) {

        if (object instanceof Clock) {

            var otherClock = (Clock)object;
            return (hour == otherClock.hour) &&
                   (minute == otherClock.minute);
        } else {
            return true;
        }
    }

    ////////////////////////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }
}

