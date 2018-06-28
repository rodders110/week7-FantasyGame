import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Knight knight;

    @Before
    public void before(){
        cleric = new Cleric("Steve");
        knight = new Knight("Arthur");
    }

    @Test
    public void canGetName() {
        assertEquals("Steve", cleric.getName());
    }

    @Test
    public void canGetHP() {
        assertEquals(90, cleric.getHp());
    }

    @Test
    public void CanTakeDamage() {
        cleric.takeDamage(20);
        assertEquals(70, cleric.getHp());
    }

    @Test
    public void canReturnAttackText() {
        assertEquals("Hells Bells! That really hurt. You lost 20 points", cleric.takeDamage(20));
    }

    @Test
    public void hasHistory() {
        assertEquals("His good friend Friar Tuck has asked him to help out, he's got a keen sense for sinners and a mean left hook!", cleric.getStory());
    }

    @Test
    public void hasArrayListOfAttacks() {
        assertEquals(3, cleric.getAttacks().size());
    }

    @Test
    public void canHeal() {
        cleric.heal(knight);
        assertEquals(170, knight.getHp());
    }
}
