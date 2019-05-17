package fantasywar;

import fantasywar.interfaces.IFight;

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

    public int charactersSize() {
        return characters.size();
    }

    public void playCharacter(IFight character) {
        characters.add(character);
    }

    public int fightUsingCharacter(IFight character) {
        return character.attack();
    }

    public int changeCharacter(IFight character) {
        if (characters.size() > 0) {
            characters.remove(0);
            playCharacter(character);
        }

        return charactersSize();
    }



}
