package fantasywar.characters;

public abstract class Character {
    private String name;
    private int level;
    private int healthLevel;

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

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }
}
