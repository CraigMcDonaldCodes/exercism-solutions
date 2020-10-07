class MicroBlog {

    private static final int MAX = 5;

    public String truncate(String input) {

        var sb = new StringBuilder();

        input.codePoints()
             .limit(MAX)
             .forEach(cp -> sb.appendCodePoint(cp));

        return sb.toString();
    }
}
