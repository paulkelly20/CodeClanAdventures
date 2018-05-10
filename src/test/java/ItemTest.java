import item.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Healingtool healingTool;
    Spells spells;
    Weapon weapon;

    @Before
    public void before() {
        healingTool = new Healingtool(HealingToolType.IBUPROFEN);
        spells = new Spells(SpellType.FIREBALL);
        weapon = new Weapon(WeaponType.AXE);
        }

    @Test
    public void getIncreaseHealth() {
        assertEquals(34, healingTool.getIncreaseHealth());
    }
    @Test
    public void getSpellDamage(){
        assertEquals(20, spells.getDamagePoints());
    }

    @Test
    public void getWeaponDamage() {
        assertEquals(25, weapon.getDamagePoints());
    }
}

