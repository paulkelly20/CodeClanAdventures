import enemy.Goblin;
import item.*;
import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import players.Knight;
import players.Player;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Knight knight;
    Weapon weapon;
    Goblin goblin;
    Healingtool healingtool;
    Treasure treasure;

    @Before
    public void before() {
        weapon = new Weapon(WeaponType.CLUB);
        goblin = new Goblin("Tom", 50, weapon);
        knight = new Knight("Sammy", 100, weapon, 10);
        cleric = new Cleric("Dave", 50);
        healingtool = new Healingtool(HealingToolType.MORPHINE);
        treasure = new Treasure(TreasureType.CAR);

    }

    @Test
    public void canGetItem() {
        cleric.addHealingTool(healingtool);
        assertEquals(1, cleric.getHealingtools());
    }

    @Test
    public void canHealKnight(){

        cleric.healPlayer(healingtool, knight);
        assertEquals(200, knight.getHealthPoints());
    }

    @Test
    public void treasureIsEmpty() {
        assertEquals(0, cleric.getTreasure());
    }

    @Test
    public void clericHasACar() {
        cleric.addTreasure(treasure);
        assertEquals(1, cleric.getTreasure());
    }
}
