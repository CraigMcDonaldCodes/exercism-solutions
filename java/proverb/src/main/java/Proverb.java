class Proverb {

    private String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {

        if (words.length == 0) { return ""; }

        var sb = new StringBuilder();

        if (words.length > 1) {

            for (int i = 1; i < words.length; i++) {
                sb.append(String.format("For want of a %s the %s was lost.\n", words[i - 1], words[i]));
            }
        }

        sb.append(String.format("And all for the want of a %s.", words[0]));

        return sb.toString();
    }

}
