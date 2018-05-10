package item;

public class Healingtool{

    private HealingToolType healingToolType;

    public Healingtool(HealingToolType healingToolType) {
        this.healingToolType = healingToolType;
    }

    public int getIncreaseHealth() {

        return healingToolType.getHealingPower();
    }

    public HealingToolType getHealingToolTpye() {
        return healingToolType;
    }
}
