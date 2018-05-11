package room;

import enemy.Enemy;
import players.Player;

import java.util.ArrayList;

public abstract class Room {

    private String name;
    private ArrayList<Player> players;

    public Room(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPlayers() {
        return players.size();
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

}
