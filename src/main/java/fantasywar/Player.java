package fantasywar;

import fantasywar.interfaces.IPlay;

public class Player {
    private String playerName;
    private IPlay character;



    public Player(String playerName) {
        this.playerName = playerName;
        this.character = null;


    }

    public IPlay getCharacter() {
        return character;
    }

    public void setCharacter(IPlay character) {
        this.character = character;
    }


    public int fightUsingCharacter() {
        return character.attack();
    }

    public int defendUsingCharacter() {
        return character.defend();
    }

    public int subtractHealth(int healthToSubtract){
        int newHealth = character.getHealthLevel() - healthToSubtract;
        return character.setHealthLevel(newHealth);
    }

    public int addHealth(int healthToAdd){
        int newHealth = character.getHealthLevel() + healthToAdd;
        return character.setHealthLevel(newHealth);
    }


    public int addLevel(){
        int newLevel = character.getLevel() + 1;
        return character.setLevel(newLevel);
    }

    public int subtractLevel() {
        if (character.getLevel() >= 1) {
            int newLevel = character.getLevel() - 1;
            return character.setLevel(newLevel);
        } else {
            return 0;
        }
    }

}
