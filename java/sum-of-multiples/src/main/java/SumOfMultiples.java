class SumOfMultiples {

    private final int[] set;
    private final int number;
    private final int sum;

    public SumOfMultiples(int number, int[] set) {

        this.number = number;
        this.set = set;
        sum = computeSum();
    }

    public int getSum() {
        return sum;
    }

    private int computeSum() {

        int total = 0;

        for (int i = 1; i < number; i++) {

            for (var s : set) {

                // Don't allow division with zero
                if (s != 0 && i % s == 0) {
                    total += i;
                    break;  // Only add the value once
                }
            }
        }

        return total;
    }
}
