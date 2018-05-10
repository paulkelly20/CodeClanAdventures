package players;

import interfaces.IAttack;
import interfaces.takeDamagable;
import item.Weapon;

public class Warrior extends Player implements IAttack {

    private Weapon weapon;

    public Warrior(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }



    public int getAttackPower() {
        return weapon.getDamagePoints();
    }

    public void attack(takeDamagable enemy) {
        enemy.takeDamage(getAttackPower());
    }
}
