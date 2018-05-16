import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Gametest {

    Game game;
    Deck deck;

    @Before
    public void before() {

        game = new Game();
        deck = new Deck();
    }

    @Test
    public void canPickRandomCard() {
        deck.addCardsToDeck();
        deck.removeCardFromDeck(game.pickRandomCard());
        assertEquals(51, deck.countCardsInDeck());
    }

    @Test
    public void canTakeRandomCardFromDeck(){
        game.dealCardToPlayer(deck);
        Card card = new Card;
        assertEquals(SuitType.HEARTS, card.getSuit());
    }
}
