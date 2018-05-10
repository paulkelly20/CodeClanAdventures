package enemy;

import interfaces.takeDamagable;
import mythicalCreature.MythicalCreature;

public class Vampire extends Enemy{

    private int attackPower;

    public Vampire(String name, int healthPoints, int attackPower) {
        super(name, healthPoints);
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void attack(takeDamagable enemy) {
        enemy.takeDamage(getAttackPower());
    }

}
