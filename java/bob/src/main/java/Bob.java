public class Bob {

    public String hey(String input) {

        input = input.trim();

        // First check is nothing is said
        if (input.isBlank()) {
            return "Fine. Be that way!";
        }

        var yell = isTextAllUpper(input);
        var question = false;

        if (input.endsWith("?")) {
            question = true;
        }

        if (yell && question) {
            return "Calm down, I know what I'm doing!";
        }

        if (yell) {
            return "Whoa, chill out!";
        }

        if (question) {
            return "Sure.";
        }

        // default value for any non-matching input
        return "Whatever.";
    }

    private static boolean isTextAllUpper(String input) {

        var isLower = false;
        var isUpper = false;

        // is this assumption valid for unicode?
        for (char c: input.toCharArray()) {
            if (Character.isLowerCase(c)) { isLower = true;}
            if (Character.isUpperCase(c)) { isUpper = true;}
        }

        return !isLower && isUpper;
    }
}
