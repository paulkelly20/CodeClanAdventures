import enemy.Goblin;
import enemy.Vampire;
import item.Weapon;
import item.WeaponType;
import mythicalCreature.Dragon;
import mythicalCreature.Orge;
import org.junit.Before;
import org.junit.Test;
import players.Knight;
import players.Player;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Knight knight ;
    Weapon weapon;
    Vampire vampire;
    Goblin goblin;
    Dragon dragon;
    Orge orge;


    @Before
    public void before() {
        weapon = new Weapon(WeaponType.AXE);
        vampire = new Vampire("Mona", 500, 20);
        goblin = new Goblin("Sam", 50, weapon);
        knight = new Knight("Sir Lancelot", 100, weapon, 10);

    }

    @Test
    public void getKnightsHealthValue() {
        assertEquals(100, knight.getHealthPoints());
    }

    @Test
    public void testKnightCanTakeDamage() {
        vampire.attack(knight);
        assertEquals(90, knight.getHealthPoints());

    }
}
