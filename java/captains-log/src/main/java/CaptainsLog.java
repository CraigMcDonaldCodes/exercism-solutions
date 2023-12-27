import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(PLANET_CLASSES.length)];
    }

    String randomShipRegistryNumber() {

        // upper bound inclusive: 1_000 - 9_999
        return "NCC-%d".formatted(random.nextInt(9_000)+ 1000);
    }

    double randomStardate() {

        // upper bound exclusive: 41_000.0 - 42_000.0
        return random.nextDouble(1_000) + 41_000;
    }
}
