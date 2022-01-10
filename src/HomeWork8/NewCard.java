package HomeWork8;

public class NewCard {
    private String suit;
    private String value;

    public NewCard(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.value + " of " + this.suit;
    }
}