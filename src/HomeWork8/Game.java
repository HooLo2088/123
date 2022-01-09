package HomeWork7;

public class Game {
    public static void main(String[] args){
        Poker poker = new Poker();

        Card[] deck = poker.creatDeck();
        poker.shuffle(deck);
        poker.serveCards(deck,4);
    }
}
