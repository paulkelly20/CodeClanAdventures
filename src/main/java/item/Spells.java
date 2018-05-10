package item;


public class Spells {

    private SpellType spellType;

    public Spells(SpellType spellType) {

      this.spellType = spellType;
    }

    public int getDamagePoints() {
        return spellType.getAttackPower();
    }

    public SpellType getSpellType() {
        return spellType;
    }
}
