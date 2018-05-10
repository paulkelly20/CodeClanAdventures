import item.Weapon;
import item.WeaponType;
import mythicalCreature.Dragon;
import mythicalCreature.Orge;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrgeTest {

    Orge orge;
    Weapon weapon;

    @Before
    public void before() {
        weapon = new Weapon(WeaponType.CLUB);
        orge = new Orge("Orge", 50, weapon );
    }
    @Test
    public void canGetWeapon(){
        assertEquals(weapon, orge.getWeapon());
    }

    @Test
    public void weaponPowerValue() {
        assertEquals(15, orge.getAttackPower());
    }
    @Test
    public void canTakeDamageFromDragon(){
        Dragon dragon = new Dragon("Dragon", 100, 10);
        dragon.attack(orge);
        assertEquals(40, orge.getHealthPoints() );
    }
}
