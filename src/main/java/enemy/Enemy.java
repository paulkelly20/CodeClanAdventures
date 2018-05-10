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
        this.healthPoints -= damage;
    }

    public void attack(takeDamagable enemy) {
        enemy.takeDamage(getAttackPower());
    }

}
