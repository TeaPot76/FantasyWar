package fantasywar.characters.warriors;

import fantasywar.characters.Character;
import fantasywar.charactertools.Weapon;

public class Warrior extends Character {

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
    public int attack(){
        return weapon.getAttackValue();
    }

    public int defend(){
        return weapon.getAttackValue()/2;
    }
}
