package mythicalCreature;

import interfaces.IAttack;
import interfaces.takeDamagable;

public class Dragon extends MythicalCreature {


    private int attackPower;

    public Dragon(String name, int healthPoints, int attackPower) {
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
