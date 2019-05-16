package fantasywar.characters;

import fantasywar.charactertools.Creature;
import fantasywar.charactertools.Spell;
import fantasywar.charactertools.Weapon;

public class Warrior extends Character{

    private Weapon weapon;



    public Warrior(String name, int healthLevel, Weapon weapon) {
        super(name, healthLevel);
        this.weapon = weapon;

    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
