package HomeWork8;

public class NewGame {
    public static void main(String[] args){
        NewPoker pocker = new NewPoker();

        NewCard[] deck = pocker.createDeck();
        pocker.shuffle(deck);
        pocker.serveCards(deck, 20);

    }
}

