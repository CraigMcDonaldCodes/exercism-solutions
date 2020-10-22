
public class RunLengthEncoding {

    // TODO: Remove after all tests are passing
    public static void main(String... args) {

        var rle = new RunLengthEncoding();
        System.out.print(rle.decode("3W10A"));
        System.out.print(rle.decode("XYZ"));
    }

    ////////////////////////////////////////////////////////////////////////////////
    public String decode(final String text) {

        if (text.length() < 2) { return text; }

        var sb = new StringBuilder();
        int multiplier = 1;
        char previous = text.charAt(0);

        // TODO: Is there a better way than this?
        if (Character.isDigit(previous)) { multiplier = Character.getNumericValue(previous); }

        for (char c : text.substring(1).toCharArray()) {

            if (Character.isDigit(c)) {

                if (Character.isDigit(previous)) {
                    multiplier *= 10;
                    multiplier += Character.getNumericValue(c);
                } else {
                    multiplier = Character.getNumericValue(c);
                }
            } else {
                sb.append(String.valueOf(c).repeat(multiplier));
                multiplier = 1;
            }

            previous = c;
        }

        return sb.toString();
    }

    ////////////////////////////////////////////////////////////////////////////////
    public String encode(final String text) {

        // Quick return
        if (text.length() < 2) { return text; }

        var sb = new StringBuilder();

        char current = text.charAt(0);
        int count = 1;

        for (char c : text.substring(1).toCharArray()) {

            if (current == c) {
                count++;
            } else {

                if (count > 1) {
                    sb.append(count);
                }

                sb.append(current);
                count = 1;
            }

            current = c;
        }

        // I think this is a bit hacky
        if (count > 1) { sb.append(count); }
        sb.append(current);

        return sb.toString();
    }
}
