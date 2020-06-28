class IsbnVerifier {

    public static void main(String... args) {

        var verify = new IsbnVerifier();
        System.out.println(verify.isValid("3-598-21507-X"));
        System.out.println(verify.isValid("0-306-40615-2"));
    }

    boolean isValid(String stringToVerify) {

        String isbn = stringToVerify.replace("-", "").toLowerCase();

        if (isbn.length() != 10) {
            return false;
        }

        System.out.println(isbn);

        int sum = 0;
        int count = 10;

        for(var s : isbn.toCharArray()) {

            if (Character.isDigit(s)) {
                sum += (s * count);
            } else if (s == 'x' && count == 1) {
                System.out.println("Was x");
                sum += 10;
            } else {
                sum = -1;
                break;
            }

            count--;
        }

        System.out.printf("sum: %d, count: %d\n", sum, count);
        return sum % 11 == 0;
    }
}
