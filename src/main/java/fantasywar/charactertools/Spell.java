package fantasywar.charactertools;

public enum Spell {
    TESTSPELL(0),
    FIREBOLT (2),
    LIGHTNING(4),
    FROSTRUNE(4),
    ICESPIKE(6);



    private final int attackValue;

    Spell(int attackValue){
        this.attackValue = attackValue;
    }

    public int getAttackValue() {
        return attackValue;
    }
}
