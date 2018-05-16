import java.util.ArrayList;

public class Game {

    public int pickRandomCard(){
        int random = (int)(Math.random() * 52 + 1);
            return random;
    }

    public Card dealCardToPlayer(Deck deck){
        Card card = deck.removeCardFromDeck(this.pickRandomCard());
        return card;
    }

}

