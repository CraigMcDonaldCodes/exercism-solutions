import java.util.Objects;

// https://en.wikipedia.org/wiki/Luhn_algorithm
class LuhnValidator {

    private final int MIN_LENGTH = 2;
    private final int MAX_VALUE = 9;

    boolean isValid(final String candidate) {

        // Early return
        if (candidate == null || candidate.length() < MIN_LENGTH) {
            return false;
        }

        int number = 0;

        try {
            number = Integer.parseInt(candidate.replace(" ", ""));
        } catch (NumberFormatException e) {
            return false;
        }

        int sum = 0;
        boolean mustDouble = false;

        while (number > 0) {

            int end = number % 10;

            if (mustDouble) {

                end *= 2;

                if (end > MAX_VALUE) {
                    end -= MAX_VALUE;
                }

                mustDouble = false;
            } else {
                mustDouble = true;
            }

            sum += end;

            number /= 10;
        }

        return sum % 10 == 0;
    }
}
