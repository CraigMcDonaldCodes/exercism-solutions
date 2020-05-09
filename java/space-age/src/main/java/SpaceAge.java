class SpaceAge {

    final double seconds;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return seconds / 31_557_600;
    }

    double onMercury() {
        return onEarth() / 0.2_408_467;
    }

    double onVenus() {
        return onEarth() / 0.61_519_726;
    }

    double onMars() {
        return onEarth() / 1.8_808_158;
    }

    double onJupiter() {
        return onEarth() / 11.8_626_15;
    }

    double onSaturn() {
        return onEarth() / 29.447_498;
    }

    double onUranus() {
        return onEarth() / 84.016_846;
    }

    double onNeptune() {
        return onEarth() / 164.79_132;
    }
}
