package fantasywar.charactertools;

public enum Weapon {
    SWORD (10),
    BATTLEAXE(12),
    CROSSBALL(14),
    SPEAR(16);



    private final int attackValue;

    Weapon(int attackValue){
        this.attackValue = attackValue;
    }

    public int getAttackValue() {
        return attackValue;
    }
}
