package players;

import interfaces.IAttack;
import interfaces.takeDamagable;
import item.Spells;
import mythicalCreature.MythicalCreature;

import java.util.ArrayList;

public abstract class Mage extends Player implements IAttack {

    ArrayList<MythicalCreature> protector;
    Spells spells;


    public Mage(String name, int healthPoints, Spells spells) {
        super(name, healthPoints);
        this.protector = new ArrayList<>();
        this.spells = spells;
    }

    public int hasProtector() {
        return protector.size();
    }

    public Spells getSpells() {
        return spells;
    }

    public void setSpells(Spells spells) {
        this.spells = spells;
    }

    public void attack(takeDamagable enemy) {
        enemy.takeDamage(getAttackPower());
    }

}
