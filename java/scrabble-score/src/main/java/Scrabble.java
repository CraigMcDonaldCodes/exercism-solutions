class Scrabble {

    private String word;
    private int score;

    Scrabble(String word) {

        this.word = word.toLowerCase();
        score = wordScore();
    }

    int getScore() {
        return score;
    }

    private int wordScore() {

        int total = 0;

        for (var c: word.toCharArray()) {

            switch(c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'l':
                case 'n':
                case 'r':
                case 's':
                case 't':
                    total += 1;
                    break;
                case 'd':
                case 'g':
                    total += 2;
                    break;
                case 'b':
                case 'c':
                case 'm':
                case 'p':
                    total += 3;
                    break;
                case 'f':
                case 'h':
                case 'v':
                case 'w':
                case 'y':
                    total += 4;
                    break;
                case 'k':
                    total += 5;
                    break;
                case 'j':
                case 'x':
                    total += 8;
                    break;
                case 'q':
                case 'z':
                    total += 10;
                    break;
                default:
                    break;
            }
        }

        return total;
    }
}
