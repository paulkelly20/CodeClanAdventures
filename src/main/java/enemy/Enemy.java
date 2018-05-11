package enemy;

import interfaces.IAttack;
import interfaces.takeDamagable;

public abstract class Enemy implements IAttack, takeDamagable {

    private String name;
    private int healthPoints;


    public Enemy(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;

    }

    public String getName() {
        return name;
    }


    public int getHealthPoints() {
        return this.healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void takeDamage(int damage) {
        if(this.healthPoints > damage){
        this.healthPoints -= damage;}
        else this.healthPoints = 0;
            enemyDead();
    }

    public void attack(takeDamagable enemy) {
        enemy.takeDamage(getAttackPower());
    }

    public String enemyDead(){
        return"You have defeated the Enemy";
    }

}
