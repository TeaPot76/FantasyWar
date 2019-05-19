package gameTests;

import fantasywar.Game;
import fantasywar.Player;
import fantasywar.characters.Cleric;
import fantasywar.characters.magicians.Warlock;
import fantasywar.characters.magicians.Wizard;
import fantasywar.characters.warriors.Knight;
import fantasywar.charactertools.Creature;
import fantasywar.charactertools.Spell;
import fantasywar.charactertools.Weapon;
import fantasywar.rooms.Room;
import fantasywar.rooms.Treasure;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class GameTest {

    private Game game;
    private Room room1;
    private Room room2;
    private Player player1;
    private Player player2;
    private Knight knight;
    private Wizard wizard;
    private Warlock warlock;
    private Cleric cleric1;
    private Cleric cleric2;

    @Before
    public void before(){

        wizard = new Wizard("Ganadalf",100, Spell.FROSTRUNE, Creature.DRAGON);
        knight = new Knight("Himan", 10, Weapon.SPEAR);
        warlock = new Warlock("Ganadalf",100, Spell.TESTSPELL, Creature.DRAGON);
        ArrayList characters = new ArrayList<>();
        player1 = new Player("Bob");
        player2 = new Player("Bob");

        cleric1 = new Cleric("Gandalf", 100);
        cleric2 = new Cleric("GoodPal", 100);
        room1 = new Room("Dark", Treasure.RUBY);
        room2 = new Room("Adventure", Treasure.GOLD);
        game = new Game(characters, player1, room1, cleric1);
        game.addCharacter(knight);
        game.addCharacter(warlock);
    }


    @Test
    public void hasCharacters(){
        game.addCharacter(knight);
        game.addCharacter(warlock);
        assertEquals(4, game.charactersSize());

    }

    @Test
    public void canSetCharacters(){
        ArrayList character = new ArrayList<>();
        game.setCharacters(character);
        game.addCharacter(knight);
        assertEquals(1, game.charactersSize());

    }



    @Test
    public void hasCharactersSize(){
        game.addCharacter(knight);
        game.addCharacter(warlock);
        assertEquals(4, game.charactersSize());

    }

    @Test
    public void hasPlayer(){
        assertEquals(player1, game.getPlayer());

    }

    @Test
    public void canSetPlayer(){
        game.setPlayer(player2);
        assertEquals(player2, game.getPlayer());
    }


    @Test
    public void hasRoom(){
        assertEquals(room1, game.getRoom());

    }

    @Test
    public void canSetRoom(){
        game.setRoom(room2);
        assertEquals(room2, game.getRoom());
    }


    @Test
    public void hasCleric(){
        assertEquals(cleric1, game.getCleric());

    }

    @Test
    public void canSetCleric(){
        game.setCleric(cleric2);
        assertEquals(cleric2, game.getCleric());
    }

    @Test
    public void hasDamage(){
        assertEquals(0, game.getDamage());

    }

    @Test
    public void canSetDamage() {
        int damage = 3;
        game.setDamage(damage);
        assertEquals(damage, game.getDamage());
    }

    @Test
    public void hasInflictDamage(){
        int damage = 0;
        int result = game.characterInflictsDamage(knight);
        assertEquals(6, result);
    }

//    @Test
    // check if random for dice works
//    public void canRollDice(){
//        assertEquals(1, game.rollDice());
//    }


    @Test
    public void canAttackPlayer1Wins() {
        wizard = new Wizard("Ganadalf",100, Spell.FROSTRUNE, Creature.DRAGON);
        knight = new Knight("Himan", 10, Weapon.SPEAR);
        player1.setCharacter(knight);
        player2.setCharacter(wizard);

        //result if player.1 spear = 6
        assertEquals(94,   game.attack(player1, player2));
    }

    @Test
    public void canAttackPlayer2Wins(){
        warlock = new Warlock("Ganadalf",90, Spell.TESTSPELL, Creature.OGRE);
        wizard = new Wizard("Goofie",100, Spell.FROSTRUNE, Creature.DRAGON);
        player1.setCharacter(warlock);
        player2.setCharacter(wizard);

        //result if player.2 frostrune = 4
        assertEquals(102,  game.attack(player1, player2));

    }

//    @Test
//    public void canChangeCharacter(){
//        // setup
//      List<IPlay> expectedCharacters = Collections.singletonList(wizard);
//       // List<IPlay> expectedCharacters = new ArrayList<>();
//        //expectedCharacters.add(wizard);
//        List<IPlay> initialCharacter = new ArrayList<>();
//        initialCharacter.add(knight);
//        player2.setCharacters(initialCharacter);
//        // test
//        player2.changeCharacter(wizard);
//
//        // checks
//        assertEquals(1, player2.charactersSize());
//        assertEquals(expectedCharacters, player2.getCharacters());
//    }



}
