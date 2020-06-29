class IsbnVerifier {

    boolean isValid(String stringToVerify) {

        String isbn = stringToVerify.replace("-", "").toLowerCase();

        if (isbn.length() != 10) {
            return false;
        }

        int sum = 0;
        int count = 10;

        for (char value : isbn.toCharArray()) {

            if (Character.isDigit(value)) {
                sum += Character.getNumericValue(value) * count;
            } else if (value == 'x' && count == 1) {
                sum += 10;
            } else {
                sum = -1;
                break;
            }

            count--;
        }

        return sum % 11 == 0;
    }
}
