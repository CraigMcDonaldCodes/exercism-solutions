class RnaTranscription {

    String transcribe(String dnaStrand) {

        var sb = new StringBuilder();

        for (var c : dnaStrand.toCharArray()) {

            switch (c) {
                case 'G':
                    sb.append('C');
                    break;
                case 'C':
                    sb.append('G');
                    break;
                case 'T':
                    sb.append('A');
                    break;
                case 'A':
                    sb.append('U');
                    break;
                // TODO: maybe there should be a default case
            }
        }

        return sb.toString();
    }
}
