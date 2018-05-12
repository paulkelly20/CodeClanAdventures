package room;

import enemy.Enemy;
import players.Player;

import java.util.ArrayList;

public abstract class Room {

    private String name;
    protected ArrayList<Player> players;

    public Room(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPlayersCount() {
        return players.size();
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public Player removePlayer(){
        return this.players.remove(0);
    }

    public String playerHasStillToCompleteRoom(){
        return "Keep trying";
    }

    public String playerHasLost(){
        return "You lose";
    }

    public String playerHasCompletedRoom(){
        return "You have completed the room";
    }


}
