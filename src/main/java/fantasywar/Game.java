package fantasywar;

import fantasywar.characters.Cleric;
import fantasywar.interfaces.IFight;
import fantasywar.rooms.Room;

import java.util.List;

public class Game {
    private List<IFight>characters;
    private Player player;
    private Room room;
    private Cleric cleric;
    private int damage;

    public Game(List<IFight> characters, Player player, Room room, Cleric cleric) {
        this.characters = characters;
        this.player = player;
        this.room = room;
        this.cleric = cleric;
        this.damage = 0;
    }

    public List<IFight> getCharacters() {
        return characters;
    }

    public int charactersSize(){
        return characters.size();
    }

    public void addCharacter(IFight character){
        characters.add(character);
    }

    public Player getPlayer() {
        return player;
    }

    public Room getRoom() {
        return room;
    }

    public Cleric getCleric() {
        return cleric;
    }

    public int getDamage() {
        return damage;
    }

    public void setCharacters(List<IFight> characters) {
        this.characters = characters;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setCleric(Cleric cleric) {
        this.cleric = cleric;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int characterInflictsDamage(IFight character){
        return damage += character.attack();
    }
}
