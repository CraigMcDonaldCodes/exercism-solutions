import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PrimeCalculator {

    private final int MIN_SIZE = 1;
    private final int FIRST_PRIME = 2;
    private final List<Integer> primes;

    public PrimeCalculator() {

        primes = new ArrayList<>();
        primes.add(FIRST_PRIME);
    }

    int nth(int nth) {

        if (nth < MIN_SIZE) { throw new IllegalArgumentException(); }

        if (primes.size() < nth) {
            updatePrimes(nth);
        }

        return primes.get(nth - 1);
    }

    private void updatePrimes(final int nth) {

        for (int i = primes.get(primes.size() - 1) + 1; primes.size() < nth; i++) {

            if (isPrime(i)) {
                primes.add(i);
            }
        }
    }

    private boolean isPrime(final int value) {

        // There will be a much better way of doing this
        if (value < FIRST_PRIME)      { return false; }
        if (value % FIRST_PRIME == 0) { return false; }

        final int max = value / 2;
        final int step = 2;
        boolean prime = true;

        for (int i = FIRST_PRIME + 1; i <= max; i += step) {

            if (value % i == 0) {
                prime = false;
                break;
            }
        }

        return prime;
    }
}
