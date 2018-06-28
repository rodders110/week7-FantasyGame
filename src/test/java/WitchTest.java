import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WitchTest {

    Witch witch;

    @Before
    public void before(){
        witch = new Witch("Agatha");
    }

    @Test
    public void canGetName() {
        assertEquals("Agatha", witch.getName());
    }

    @Test
    public void canGetHP() {
        assertEquals(190, witch.getHp());
    }

    @Test
    public void CanTakeDamage() {
        witch.takeDamage(20);
        assertEquals(170, witch.getHp());
    }

    @Test
    public void canReturnAttackText() {
        assertEquals("It burns! That really burns. You lost 20 points", witch.takeDamage(20));
    }

    @Test
    public void hasHistory() {
        assertEquals("Not cut out for Narnia, she decides to try her luck with the normal world. Has some good spells she likes to use, only for good of course!", witch.getStory());
    }

    @Test
    public void hasArrayListOfAttacks() {
        assertEquals(4, witch.getAttacks().size());
    }
}
