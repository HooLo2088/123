package HomeWork8;

import java.util.Random;

public class NewPoker {
    public NewCard[] createDeck(){
        String[] suites = {"Hearts", "Clubs", "Diamonds", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        NewCard[] deck = new NewCard[suites.length * values.length];

        int count = 0;
        for (String suite : suites) {
            for (String value : values) {
                deck[count++] = new NewCard(suite, value);
            }
        }
        return deck;
    }

    public void shuffle(NewCard[] deck) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int in = random.nextInt(52);
            int out = random.nextInt(52);

            NewCard card = deck[in];
            deck[in] = deck[out];
            deck[out] = card;
        }
    }
    public void serveCards(NewCard[] deck, int noOfPlayers){
        int count = 0;
        for (int round = 1; round < 6; round++) {
            System.out.printf("%d round: %n", round);
            for (int player = 1; player <= noOfPlayers; player++) {
                if (count > 51){
                    throw new NoCardException();
                }
                System.out.printf("Player %d gets %s%n", player, deck[count++]);
            }
            System.out.println("_______________________________");
        }
    }
}
