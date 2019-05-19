

package fantasywar.characters;


import fantasywar.interfaces.IPlay;

public abstract class Character implements IPlay {
    private String name;
    private int level;
    public int healthLevel;

    public Character(String name, int healthLevel) {
        this.name = name;
        this.level = 0;
        this.healthLevel = healthLevel;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int setLevel(int level) {
        return this.level = level;
    }

    public int setHealthLevel(int healthLevel) {
        return this.healthLevel = healthLevel;
    }


}
