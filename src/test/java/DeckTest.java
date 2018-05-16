import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;


    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.HEARTS,RankType.ACE);

    }

    @Test
    public void canAddCardsToDeck(){
        deck.addCardsToDeck();
        assertEquals(52, deck.countCardsInDeck());
    }

    @Test
    public void canRemoveCardFromDeck(){
        deck.addCardsToDeck();
        deck.removeCardFromDeck(10);
        assertEquals(51, deck.countCardsInDeck());
    }

//    @Test
//    public void canDealRandomCardToPlayer
}
