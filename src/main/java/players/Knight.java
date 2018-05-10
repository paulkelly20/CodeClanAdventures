package players;

import interfaces.takeDamagable;
import item.Weapon;

public class Knight extends Warrior {

    private int shield;

    public Knight(String name, int healthPoints, Weapon weapon, int shield) {
        super(name, healthPoints, weapon);
        this.shield = shield;
    }

    public int getShield() {
        return shield;
    }



    public void takeDamage(int damage) {
        this.healthPoints -= (damage -= shield);
    }




}
