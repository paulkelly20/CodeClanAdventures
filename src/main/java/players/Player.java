package players;

import interfaces.takeDamagable;
import item.Healingtool;
import item.Treasure;

import java.util.ArrayList;

public abstract class Player implements takeDamagable{

    private String name;
    protected int healthPoints;
    private ArrayList<Treasure> treasure;

    public Player(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.treasure = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getTreasure() {
        return treasure.size();
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void takeDamage(int damage) {
        this.healthPoints -= damage;
    }

    public void addTreasure(Treasure treasure){
        this.treasure.add(treasure);
    }
}
