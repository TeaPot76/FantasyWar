package fantasywar;

import fantasywar.interfaces.IFight;

public class Player {
    private String playerName;

    private IFight character;

    public Player(String playerName) {
        this.playerName = playerName;
        this.character = null;
    }

    public IFight getCharacter() {
        return character;
    }

    public void setCharacter(IFight character) {
        this.character = character;
    }


    public int fightUsingCharacter() {
        return character.attack();
    }



}
