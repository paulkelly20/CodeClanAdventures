package room;

import enemy.Enemy;
import item.Treasure;
import players.Player;

import java.util.ArrayList;

public class TreasureRoom extends Room {

    protected ArrayList<Treasure> treasures;

    public TreasureRoom(String name) {
        super(name);
        this.treasures = new ArrayList<>();
    }

    public int getTreasures() {
       return this.treasures.size();
    }
    public void addTreasure(Treasure treasure){
        this.treasures.add(treasure);
    }



    public void removeTreasure(Player player, Treasure treasure){
        this.treasures.remove(treasure);
        player.addTreasure(treasure);
        }


    public String checkIfAllTreasureIsCollected() {
        if (this.treasures.size() == 0 && this.players.size() > 0) {
                return playerHasCompletedRoom();
            }
            return  playerHasStillToCompleteRoom();
    }



}
