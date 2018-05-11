import enemy.Goblin;
import item.*;
import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import players.Knight;
import room.EnemyRoom;
import room.Room;
import room.TreasureRoom;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Cleric cleric;
    Knight knight;
    Weapon weapon;
    Goblin goblin;
    Healingtool healingtool;
    Treasure treasure;
    TreasureRoom room;
    EnemyRoom enemyRoom;

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

    }

    @Test
    public void addTreasureToRoom() {
        room.addTreasure( treasure);
        assertEquals(1, room.getTreasures());
    }

    @Test
    public void removeTreasureFromRoomGiveToPlayer() {
        room.addTreasure( treasure);
        room.removeTreasure(cleric, treasure);
        assertEquals(1, cleric.getTreasure());
        assertEquals(0, room.getTreasures());
    }

    @Test
    public void addEnemyToRoom() {
        enemyRoom.addEnemies(goblin);
        assertEquals(1, enemyRoom.getEnemies());
    }

    @Test
    public void testAddPlayer() {
        room.addPlayer(knight);
        assertEquals(1, room.getPlayers());
    }

        @Test
    public void playerCanWin() {
        enemyRoom.addEnemies(goblin);
        enemyRoom.addPlayer(knight);
        knight.attack(goblin);
        knight.attack(goblin);
        knight.attack(goblin);
        knight.attack(goblin);
        knight.attack(goblin);
        knight.attack(goblin);
        knight.attack(goblin);
        assertEquals("You have defeated the Enemy", goblin.enemyDead());
    }

    @Test
    public void playerIsAliveInRoom() {
        enemyRoom.addPlayer(knight);
        assertEquals(true, enemyRoom.checkIfPlayersAreStillAlive());
    }

    @Test
    public void enemyIsAliveRoom() {
        enemyRoom.addEnemies( goblin);
        assertEquals(true, enemyRoom.checkIfEnemysAreStillAlive());
    }

    @Test
    public void playerCompletesRoom(){
        enemyRoom.addEnemies(goblin);
        enemyRoom.addPlayer(knight);
        knight.attack(goblin);
        knight.attack(goblin);
        knight.attack(goblin);
        knight.attack(goblin);
        knight.attack(goblin);
        knight.attack(goblin);
        knight.attack(goblin);
        assertEquals("You have completed the room", enemyRoom.roomCompletedStatus());

    }

    @Test
    public void playerDiesInRoom(){
        enemyRoom.addEnemies(goblin);
        enemyRoom.addPlayer(knight);
        goblin.attack(knight);
        goblin.attack(knight);
        goblin.attack(knight);
        goblin.attack(knight);
        goblin.attack(knight);
        goblin.attack(knight);
        goblin.attack(knight);
        goblin.attack(knight);
        goblin.attack(knight);
        goblin.attack(knight);
        goblin.attack(knight);
        goblin.attack(knight);
        goblin.attack(knight);
        goblin.attack(knight);
        goblin.attack(knight);
        goblin.attack(knight);
        goblin.attack(knight);
        goblin.attack(knight);
        goblin.attack(knight);
        goblin.attack(knight);
        goblin.attack(knight);
        goblin.attack(knight);
        assertEquals("You lose", enemyRoom.roomCompletedStatus());

    }

    @Test
    public void testTreasueRoomHasntBeenCompleted() {
        room.addPlayer(knight);
        room.addTreasure(treasure);
        assertEquals("Keep trying", room.checkIfAllTreasureIsCollected());
    }

    @Test
    public void testTreasureRoomHasBeenCompleted() {
        room.addPlayer(knight);
        room.addTreasure(treasure);
        room.removeTreasure(knight, treasure);
        assertEquals("You have completed the room", room.checkIfAllTreasureIsCollected());
    }
}
