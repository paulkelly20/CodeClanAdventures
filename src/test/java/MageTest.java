import enemy.Vampire;
import item.SpellType;
import item.Spells;
import mythicalCreature.Dragon;
import org.junit.Before;
import org.junit.Test;
import players.Wizard;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MageTest {

    Wizard wizard;
    Dragon dragon;
    Spells spells;
    Vampire vampire;

    @Before
    public void before() {
        spells = new Spells(SpellType.FIREBALL);
        dragon = new Dragon("Dragon", 100, 10);
        vampire = new Vampire("Mona", 100, 10);
        wizard = new Wizard("Merlin", 100, spells);
    }

    @Test
    public void canBeAttacked() {
        vampire.attack(wizard);
        assertEquals(90, wizard.getHealthPoints());
    }
    @Test
    public void canAttackVampire(){
        wizard.attack(vampire);
        assertEquals(80, vampire.getHealthPoints());
    }

    @Test
    public void doesntHaveProtector() {
        assertEquals(0, wizard.hasProtector());

    }

    @Test
    public void hasProtector() {
        wizard.addProtector(dragon);
        assertEquals(1, wizard.hasProtector());
    }

    @Test
    public void checkIfProtectorCanAttack() {
        wizard.addProtector(dragon);
        wizard.getProtectorToAttack(dragon, vampire);
        assertEquals(90, vampire.getHealthPoints());
    }
}
