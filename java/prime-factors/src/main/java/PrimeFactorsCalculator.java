import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class PrimeFactorsCalculator {

    public List<Long> calculatePrimeFactorsOf(final long value) {

        final var list = new ArrayList<Long>();
        long upperLimit = value / 2;
        long currentValue = value;

        if (value < 2) {
            return list;
        }

        var primes = new PrimesIterator();

        while (currentValue > 1 && primes.hasNext()) {

            long prime = primes.next();

            while (currentValue % prime == 0) {
                list.add(prime);
                currentValue /= prime;
            }
        }

        return list;
    }
}

class PrimesIterator implements Iterator<Long> {

    private static final Long PRIME_INCREMENT = 2L;
    private final List<Long> primes;

    public PrimesIterator() {

        primes = new ArrayList<>();
    }

    @Override
    public boolean hasNext() {

        if (primes.size() == 0) {
            return true;
        } else {
            return primes.get(primes.size() - 1) < Long.MAX_VALUE;
        }
    }

    @Override
    public Long next() {

        // The first two primes
        if (primes.size() == 0) { primes.add(2L); return 2L; }
        if (primes.size() == 1) { primes.add(3L); return 3L; }

        long possiblePrime = primes.get(primes.size() - 1);
        boolean notFound = true;

        while (notFound) {

            possiblePrime += PRIME_INCREMENT;

            for (long p : primes) {

                if (possiblePrime % p == 0) {
                    break;
                } else {
                    notFound = false;
                    break;
                }
            }
        }

        long nextPrime = possiblePrime;
        primes.add(nextPrime);

        return nextPrime;
    }
}
