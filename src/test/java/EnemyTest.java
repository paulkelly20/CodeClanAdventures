import enemy.Goblin;
import enemy.Vampire;
import item.Weapon;
import item.WeaponType;
import mythicalCreature.Dragon;
import mythicalCreature.Orge;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

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

    }

    @Test
    public void canAttack(){
        Dragon dragon =  new Dragon("Dragon", 500, 20);
        vampire.attack(dragon);
        assertEquals(480, dragon.getHealthPoints());

    }

}
