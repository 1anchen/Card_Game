import java.util.ArrayList;

public class Deck {

    private ArrayList<Card>deckofcards;

    public Deck(){
        this.deckofcards = new ArrayList<>();
    }

    public void addCardsToDeck(){

       for(SuitType suit: SuitType.values()) {

         for(RankType rank : RankType.values()) {
            this.deckofcards.add(new Card(suit, rank));
         }
        }
    }

    public int countCardsInDeck() {
        return this.deckofcards.size();
    }
    public Card removeCardFromDeck(int number) {
        return this.deckofcards.remove(number);
    }


}
