class Darts {

    private final int score;

    Darts(double x, double y) {
        score = calculateScore(x, y);
    }

    int score() {
        return score;
    }

    private int calculateScore(double x, double y) {

        double radius = Math.sqrt(x * x + y * y);
        int score = 0;

        if (radius > 10) {
            // Outside the circle, no score
        } else if (radius > 5) {
            // Outer radius
            score = 1;
        } else if (radius > 1) {
            // Middle radius
            score = 5;
        } else if (radius >= 0) {
            // Inner radius
            score = 10;
        }

        return score;
    }
}
