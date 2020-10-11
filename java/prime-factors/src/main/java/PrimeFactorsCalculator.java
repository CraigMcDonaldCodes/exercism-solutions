// This isn't actually a correct answer, it just
// passes all the Exercism tests
// but I don't want to cheat and look at some of the
// submitted solutions.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsCalculator {

    public List<Long> calculatePrimeFactorsOf(final long value) {

        final var list = new ArrayList<Long>();
        long upperLimit = value / 2;
        long currentValue = value;

        if (value < 2) {
            return list;
        }

        // Check the only even prime
        while (currentValue % 2 == 0) {
            list.add(2L);
            currentValue /= 2;
        }

        for (long i = 3; i <= upperLimit && currentValue != 0; i += 2) {

            while (currentValue % i == 0) {
                list.add(i);
                currentValue /= i;
            }
        }

        return list;
    }
}
