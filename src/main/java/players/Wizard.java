package players;

import enemy.Enemy;
import enemy.Vampire;
import item.Spells;
import mythicalCreature.Dragon;
import mythicalCreature.MythicalCreature;

public class Wizard extends Mage {

    public Wizard(String name, int healthPoints, Spells spells) {
        super(name, healthPoints, spells);
    }

    public int getAttackPower() {
        return spells.getDamagePoints();
    }


    public void addProtector(MythicalCreature mythicalCreature) {
        this.protector.add(mythicalCreature);
    }

    public void getProtectorToAttack(MythicalCreature mythicalCreature, Enemy enemy) {
        protector.remove(mythicalCreature);
        mythicalCreature.attack(enemy);
    }
}
