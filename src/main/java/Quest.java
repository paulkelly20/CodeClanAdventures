import enemy.Enemy;
import players.Player;
import room.EnemyRoom;
import room.Room;
import room.TreasureRoom;

import java.util.ArrayList;

public class Quest {

    private ArrayList<Room> rooms;
    private EnemyRoom enemyRoom1;
    private EnemyRoom enemyRoom2;
    private TreasureRoom treasureRoom;


    public Quest(EnemyRoom enemyRoom1, TreasureRoom treasureRoom, EnemyRoom enemyRoom2) {
        this.rooms = new ArrayList<>();
        this.enemyRoom1 = enemyRoom1;
        this.enemyRoom2 = enemyRoom2;
        this.treasureRoom = treasureRoom;
        addRoomToQuest(enemyRoom1);
        addRoomToQuest(treasureRoom);
        addRoomToQuest(enemyRoom2);
    }

    public int countRoomsInQuest() {
        return rooms.size();
    }

    public void addRoomToQuest(Room room) {
        this.rooms.add(room);
    }

    public void addPlayerToQuest(Player player) {
        rooms.get(0).addPlayer(player);
    }

    public int countPlayersInRooms(int roomNumber) {
        return rooms.get(roomNumber).getPlayersCount();
    }

    public void removeRoomFromQuest(Room room) {
        rooms.remove(room);
    }

    public Player getPlayerInQuest() {
        for (Room room : this.rooms) {
            if (room.getPlayers().size() > 0) {
                return room.removePlayer();
            }
        }
        return null;
    }

    public String roomStatus() {
        Room firstRoom ;
       firstRoom = this.rooms.get(0) ;
            if (firstRoom == enemyRoom1) {
                Player player = enemyRoom1.removePlayer();
                enemyRoom2.addPlayer(player);
                this.rooms.remove(enemyRoom1);
                return firstEnemyRoomStatus();
            }

             if (firstRoom == treasureRoom) {
                Player player = treasureRoom.removePlayer();
                enemyRoom2.addPlayer(player);
                this.rooms.remove(treasureRoom);
                return treasureRoomStatus();
            }

            if (firstRoom == enemyRoom2) {
               return FinalRoomStatus();
            }

        return "Keep Questing";
        }


    public String treasureRoomStatus(){
         return treasureRoom.checkIfAllTreasureIsCollected();

    }

    public String firstEnemyRoomStatus(){
        return enemyRoom1.roomCompletedStatus();


    }

    public String FinalRoomStatus(){
        if (enemyRoom2.roomCompletedStatus().contains("You have completed the room"))
        {return "You have completed the Quest";}
        return enemyRoom2.roomCompletedStatus();
    }
}