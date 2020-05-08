class Acronym {

    String acronym;

    Acronym(String phrase) {
        acronym = findAcronym(phrase);
    }

    String get() {
        return acronym;
    }

    private String findAcronym(String phrase) {

        String[] words = phrase.split(" |-|_");
        var sb = new StringBuilder();

        for (var word : words) {

            if (word.isEmpty()) { continue; }
            sb.append(word.charAt(0));
        }

        return sb.toString().toUpperCase();
    }
}
