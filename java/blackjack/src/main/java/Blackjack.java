import java.util.HashMap;
import java.util.Map;

public class Blackjack {

    private static final int SCORE = 21;
    private static Map<String, Integer> cardValues;

    static {
        cardValues = new HashMap<>();
        cardValues.put("ace", 11);
        cardValues.put("two", 2);
        cardValues.put("three", 3);
        cardValues.put("four", 4);
        cardValues.put("five", 5);
        cardValues.put("six", 6);
        cardValues.put("seven", 7);
        cardValues.put("eight", 8);
        cardValues.put("nine", 9);
        cardValues.put("ten", 10);
        cardValues.put("jack", 10);
        cardValues.put("queen", 10);
        cardValues.put("king", 10);
        cardValues.put("other", 0);
    }

    public int parseCard(String card) {
        return cardValues.getOrDefault(card, 0);
    }

    public boolean isBlackjack(String card1, String card2) {

        var value = parseCard(card1) + parseCard(card2);

        return value == SCORE;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {

        if (!isBlackjack) {
            return "P";
        }

        if (isBlackjack && dealerScore >= 10) {
            return "S";
        } else {
            return "W";
        }
    }

    public String smallHand(int handScore, int dealerScore) {

        // This is a bit ugly
        if (handScore >= 17) {
            return "S";
        } else if (handScore <= 16 && handScore >= 12) {

            if (dealerScore >= 7) {
                return "H";
            } else {
                return "S";
            }
        } else  {
            // handScore <= 11
            return "H";
        }
    }


    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {

        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
