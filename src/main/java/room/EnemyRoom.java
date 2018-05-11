package room;

import enemy.Enemy;
import item.Treasure;
import players.Player;

import java.util.ArrayList;

public class EnemyRoom extends Room {

    ArrayList<Enemy> enemies;

    public EnemyRoom(String name) {
        super(name);
        this.enemies =  new ArrayList<>();
    }

    public int getEnemies() {
        return this.enemies.size();
    }
    public void addEnemies(Enemy enemy) {
        this.enemies.add(enemy);
    }

    public boolean checkIfPlayersAreStillAlive(){
        for(Player player: this.players){
            if (player.getHealthPoints() > 0) {
                return true;
            }
        }
        return false;

    }

    public boolean checkIfEnemysAreStillAlive() {
        for(Enemy enemy: this.enemies){
            if (enemy.getHealthPoints() > 0) {
                return true;
            }
        }
        return false;
    }

    public String roomCompletedStatus() {
        if(checkIfPlayersAreStillAlive() && checkIfEnemysAreStillAlive())
            {return playerHasStillToCompleteRoom();}
        else if(checkIfEnemysAreStillAlive() && !checkIfPlayersAreStillAlive())
        {return playerHasLost();}
        else playersGoToNewRoom();
        return playerHasCompletedRoom();

    }

    public void playersGoToNewRoom(){}


}
