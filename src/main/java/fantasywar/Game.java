package fantasywar;

import fantasywar.characters.Cleric;
import fantasywar.interfaces.IPlay;
import fantasywar.rooms.Room;

import java.util.List;
import java.util.Random;

public class Game {
    private List<IPlay>characters;
    private Player player;
    private Room room;
    private Cleric cleric;
    private int damage;

    public Game(List<IPlay> characters, Player player, Room room, Cleric cleric) {
        this.characters = characters;
        this.player = player;
        this.room = room;
        this.cleric = cleric;
        this.damage = 0;
    }

    public List<IPlay> getCharacters() {
        return characters;
    }

    public int charactersSize(){
        return characters.size();
    }

    public void addCharacter(IPlay character){
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

    public void setCharacters(List<IPlay> characters) {
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
    public int characterInflictsDamage(IPlay character){
        return damage += character.attack();
    }

    public int rollDice(){
        int initialNumber= 0;
        int nSides = 4;
        for (int i=0; i<6; i++){
            Random r = new Random();
            int roll = r.nextInt();
            initialNumber = i +(roll %nSides);
        }

        return initialNumber;
    }



        public int attack(Player player1, Player player2) {
            int playerAttack = player1.fightUsingCharacter();
            int playerDefend = player2.defendUsingCharacter();
            int diceRoll = rollDice();
            if (diceRoll <= playerAttack){
                return player2.subtractHealth(playerAttack);
            }else{
                return player2.addHealth(playerDefend);
            }
        }
}
