import enemy.Goblin;
import enemy.Vampire;
import item.*;
import mythicalCreature.Dragon;
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
    TreasureRoom treasureRoom;
    EnemyRoom enemyRoom;
    EnemyRoom enemyRoom2;
    Quest quest;
    Vampire vampire;

    @Before
    public void before() {
        weapon = new Weapon(WeaponType.CLUB);
        goblin = new Goblin("Tom", 50, weapon);
        knight = new Knight("Sammy", 100, weapon, 10);
        vampire = new Vampire("Dracula", 30, 25);
        cleric = new Cleric("Dave", 50);
        healingtool = new Healingtool(HealingToolType.MORPHINE);
        treasure = new Treasure(TreasureType.CAR);
        treasureRoom = new TreasureRoom("Room");
        treasureRoom.addTreasure(treasure);
        enemyRoom = new EnemyRoom("First Room");
        enemyRoom.addEnemies(goblin);
        enemyRoom2 = new EnemyRoom("Final Room");
        enemyRoom2.addEnemies(vampire);
        quest = new Quest(enemyRoom, treasureRoom, enemyRoom2);

    }

    @Test
    public void checkRoomsInQuest() {
        assertEquals(3, quest.countRoomsInQuest());
    }

    @Test
    public void addPlayerToQuest() {
        quest.addPlayerToQuest(knight);
        assertEquals(1, quest.countPlayersInRooms(0));
    }

    @Test
    public void checkIfYouCanRemoveRoomFromQuest() {
        quest.removeRoomFromQuest(treasureRoom);
        assertEquals(2, quest.countRoomsInQuest());
    }

        @Test
    public void playerCompletesFirstRoom() {
        quest.addPlayerToQuest(knight);
        knight.attack(goblin);
        knight.attack(goblin);
        knight.attack(goblin);
        knight.attack(goblin);
        knight.attack(goblin);
        knight.attack(goblin);
        knight.attack(goblin);
        assertEquals("You have completed the room", quest.roomStatus());
        assertEquals(2, quest.countRoomsInQuest());
    }

    @Test
    public void playerCompletesSecondRoom() {
        quest.removeRoomFromQuest(enemyRoom);
        quest.addPlayerToQuest(knight);
        treasureRoom.removeTreasure(knight, treasure);
        assertEquals("You have completed the room", quest.roomStatus());
        assertEquals(1, quest.countRoomsInQuest());
    }

    @Test
    public void playerCompletedQuest() {
        quest.removeRoomFromQuest(enemyRoom);
        quest.removeRoomFromQuest(treasureRoom);
        quest.addPlayerToQuest(knight);
        knight.attack(vampire);
        knight.attack(vampire);
        knight.attack(vampire);
        knight.attack(vampire);
        knight.attack(vampire);
        knight.attack(vampire);
        knight.attack(vampire);
        knight.attack(vampire);
        knight.attack(vampire);
        assertEquals("You have completed the Quest", quest.roomStatus());
    }
}
