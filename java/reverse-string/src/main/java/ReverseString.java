class ReverseString {

    String reverse(String inputString) {

        var sb = new StringBuilder(inputString);
        var revString = sb.reverse().toString();    // 'Surrogate pair' safe

        return revString;
    }
}
