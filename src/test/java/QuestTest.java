import enemy.Goblin;
import item.*;
import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import players.Knight;
import room.EnemyRoom;
import room.TreasureRoom;

import static org.junit.Assert.assertEquals;

public class QuestTest {


    Cleric cleric;
    Knight knight;
    Weapon weapon;
    Goblin goblin;
    Healingtool healingtool;
    Treasure treasure;
    TreasureRoom room;
    EnemyRoom enemyRoom;
    Quest quest;

    @Before
    public void before() {
        weapon = new Weapon(WeaponType.CLUB);
        goblin = new Goblin("Tom", 50, weapon);
        knight = new Knight("Sammy", 100, weapon, 10);
        cleric = new Cleric("Dave", 50);
        healingtool = new Healingtool(HealingToolType.MORPHINE);
        treasure = new Treasure(TreasureType.CAR);
        room = new TreasureRoom("Room");
        enemyRoom = new EnemyRoom("Enemy Room");
        quest = new Quest();

    }

    @Test
    public void checkRoomsInQuest() {
        quest.addRoomToQuest(enemyRoom);
        assertEquals(1, quest.countRoomsInQuest());
    }
}
