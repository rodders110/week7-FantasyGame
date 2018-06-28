import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Cleyra");
    }

    @Test
    public void canGetName() {
        assertEquals("Cleyra", knight.getName());
    }

    @Test
    public void canGetHP() {
        assertEquals(120, knight.getHp());
    }

    @Test
    public void CanTakeDamage() {
        knight.takeDamage(20);
        assertEquals(100, knight.getHp());
    }

    @Test
    public void canReturnAttackText() {
        assertEquals("Ouch! That hurt. You lost 20 points", knight.takeDamage(20));
    }

    @Test
    public void hasHistory() {
        assertEquals("After losing his family to a terrible housefire caused by Christophilax Dilves - the Dragon, he travels from town to town seeking out this Dragon to exact his revenenge. To make ends meet his is a sword for hire and will help with any quest if the price is right", knight.getStory());
    }

    @Test
    public void hasArrayListOfAttacks() {
        assertEquals(3, knight.getAttacks().size());
    }
}
