package fantasywar.charactertools;

public enum Weapon {
    SWORD (2),
    BATTLEAXE(4),
    CROSSBALL(4),
    SPEAR(6);



    private final int attackValue;

    Weapon(int attackValue){
        this.attackValue = attackValue;
    }

    public int getAttackValue() {
        return attackValue;
    }
}
