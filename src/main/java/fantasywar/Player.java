package fantasywar;

import fantasywar.characters.IFight;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<IFight> characters;

    public Player() {
        this.characters = new ArrayList<>();
    }

    public List<IFight> getCharacters() {
        return characters;
    }

    public void setCharacters(List<IFight> characters) {
        this.characters = characters;
    }

    public int charatersSize() {
        return characters.size();
    }

    public void playCharacter(IFight character) {
        characters.add(character);
    }

}
