public class Lasagna {

    // Should probably make sure method
    // inputs are within reasonable range
    // but supplied tests are passing

    private static final int COOKING_TIME = 40;
    private static final int MINUTES_PER_LAYER = 2;

    public int expectedMinutesInOven() {
        return COOKING_TIME;
    }

    public int remainingMinutesInOven(int time) {
        return COOKING_TIME - time;
    }

    public int preparationTimeInMinutes(int layers) {
        return MINUTES_PER_LAYER * layers;
    }

    public int totalTimeInMinutes(int layers, int time) {
        return time + preparationTimeInMinutes(layers);
    }
}
