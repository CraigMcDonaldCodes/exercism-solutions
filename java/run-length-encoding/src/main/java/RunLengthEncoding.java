
public class RunLengthEncoding {

    // TODO: Remove after all tests are passing
    public static void main(String... args) {

        var rle = new RunLengthEncoding();
        System.out.println(rle.encode("XYZ"));
        System.out.println(rle.encode("AAA"));
        System.out.println(rle.encode("AAABBBBCDCD"));
    }

    ////////////////////////////////////////////////////////////////////////////////
    public String decode(final String text) {

        return "";
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

                // TODO: Nope, wrong!
                if (count > 1) {
                    sb.append(count);
                }

                sb.append(current);
                count = 1;
            }

            current = c;
        }

        return sb.toString();
    }
}
