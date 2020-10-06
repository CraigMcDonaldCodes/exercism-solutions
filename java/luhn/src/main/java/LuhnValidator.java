// This code is not great, it could be cleaner/more concise

import java.util.Objects;

// Follow validation rules based on:
// https://en.wikipedia.org/wiki/Luhn_algorithm
class LuhnValidator {

    private final int MIN_LENGTH = 2;
    private final int MAX_VALUE = 9;

    boolean isValid(final String candidate) {

        Objects.requireNonNull(candidate);
        String cleanCandidate = candidate.replace(" ", "");

        if (cleanCandidate.length() < MIN_LENGTH) {
            return false;
        }

        int sum = 0;
        boolean mustDouble = false;

        for (int i = cleanCandidate.length() - 1; i >= 0; i--) {

            int value = 0;

            if (!Character.isDigit(cleanCandidate.charAt(i))) {
                return false;
            }

            value = Character.getNumericValue(cleanCandidate.charAt(i));

            if (mustDouble) {

                value *= 2;

                if (value > MAX_VALUE) {
                    value -= MAX_VALUE;
                }

                mustDouble = false;
            } else {
                mustDouble = true;
            }

            sum += value;
        }

        return sum % 10 == 0;
    }
}
