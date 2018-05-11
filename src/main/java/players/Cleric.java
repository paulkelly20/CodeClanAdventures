package players;

import item.HealingToolType;
import item.Healingtool;

import java.util.ArrayList;

public class Cleric extends Player {

    ArrayList<Healingtool> healingtools;

    public Cleric(String name, int healthPoints) {
        super(name, healthPoints);
        this.healingtools = new ArrayList<>();
    }

    public int getHealingtools() {
        return healingtools.size();
    }


    public void addHealingTool(Healingtool healingtool) {
        healingtools.add(healingtool);
    }

    public void healPlayer(Healingtool healingtool, Player player) {
        healingtools.remove(healingtool);
        player.healthPoints += healingtool.getIncreaseHealth();
    }
}

