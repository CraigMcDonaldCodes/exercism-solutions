// https://en.wikipedia.org/wiki/Luhn_algorithm
class LuhnValidator {

    private final int MIN_LENGTH = 2;
    private final int MAX_VALUE = 9;

    boolean isValid(final String candidate) {

        // Early return
        if (candidate == null || candidate.length() < MIN_LENGTH) {
            return false;
        }

        String noSpace = candidate.replace(" ", "");

        int sum = 0;
        boolean mustDouble = false;

        for (int i = noSpace.length() - 1; i >= 0; i--) {

            int value = 0;
            if (Character.isDigit(noSpace.charAt(i))) {
                value = Character.getNumericValue(noSpace.charAt(i));
            }

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
