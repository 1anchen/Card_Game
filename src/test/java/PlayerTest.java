import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;

    @Before
    public void before(){
        player = new Player("Limmy");
        card = new Card(SuitType.HEARTS,RankType.ACE);

    }

    @Test
    public void canGetName(){
        assertEquals("Limmy",player.getName());
    }

    @Test
    public void canGetCard(){
        assertEquals(1, card.getValueFromEnum());
    }

}
