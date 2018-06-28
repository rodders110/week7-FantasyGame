import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before(){
        wizard = new Wizard("Cleyra");
    }

    @Test
    public void canGetName() {
        assertEquals("Cleyra", wizard.getName());
    }

    @Test
    public void canGetHP() {
        assertEquals(200, wizard.getHp());
    }

    @Test
    public void CanTakeDamage() {
        wizard.takeDamage(20);
        assertEquals(180, wizard.getHp());
    }

    @Test
    public void canReturnAttackText() {
        assertEquals("Goodness! That really hurt. You lost 20 points", wizard.takeDamage(20));
    }

    @Test
    public void hasHistory() {
        assertEquals("Just fresh out from conquering Mordor, he wishes to continue the good fight and goes on any adventure he can", wizard.getStory());
    }

    @Test
    public void hasArrayListOfAttacks() {
        assertEquals(4, wizard.getAttacks().size());
    }

}
