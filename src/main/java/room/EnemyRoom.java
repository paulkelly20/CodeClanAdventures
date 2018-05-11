package room;

import enemy.Enemy;
import item.Treasure;
import players.Player;

import java.util.ArrayList;

public class EnemyRoom extends Room {

    ArrayList<Enemy> enemies;
    ArrayList<Player> players;

    public EnemyRoom(String name) {
        super(name);
        this.enemies =  new ArrayList<>();
        this.players = new ArrayList<>();
    }

    public int getEnemies() {
        return this.enemies.size();
    }
    public void addEnemies(Enemy enemy) {
        this.enemies.add(enemy);
    }


    public String completeRoom(){
        for(Player player: players){ if(player.getHealthPoints() > 0 && for(Enemy enemy: enemies) (enemy.getHealthPoints() < 0;}
            return "You have Completed the room";
        }
    }

}
