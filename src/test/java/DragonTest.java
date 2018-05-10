import mythicalCreature.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DragonTest {

    Dragon dragon;

    @Before
    public void before() {
        dragon = new Dragon("Spryo", 100, 10);
    }

    @Test
    public void getAttackPower() {
        assertEquals(10, dragon.getAttackPower());
    }


    @Test
    public void testCanGiveDamage() {
        dragon.attack(dragon);
        assertEquals(90, dragon.getHealthPoints());
    }
}
