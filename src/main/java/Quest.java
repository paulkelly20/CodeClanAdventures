import room.Room;

import java.util.ArrayList;

public class Quest {

    public ArrayList<Room> rooms;

    public Quest() {
        this.rooms = new ArrayList<>();
    }

    public int countRoomsInQuest() {
        return rooms.size();
    }

    public void addRoomToQuest(Room room){
        this.rooms.add(room);

    }
}
