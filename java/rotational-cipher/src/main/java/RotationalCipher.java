public class RotationalCipher {

    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 26;
    private final int key;

    RotationalCipher(int shiftKey) {

        if (shiftKey < MIN_VALUE || shiftKey > MAX_VALUE) { throw new IllegalArgumentException(); }
        key = shiftKey;
    }

    public String rotate(String data) {

        // No rotation
        if (key == MIN_VALUE || key == MAX_VALUE) { return data; }

        var sb = new StringBuilder();

        for (var c : data.toCharArray()) {

            if (Character.isAlphabetic(c)) {
                sb.append((char)(c + key));
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
