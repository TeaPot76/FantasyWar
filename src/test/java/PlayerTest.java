import fantasywar.Player;
import fantasywar.characters.IFight;
import fantasywar.characters.Knight;
import fantasywar.characters.Warlock;
import fantasywar.characters.Wizard;
import fantasywar.charactertools.Creature;
import fantasywar.charactertools.Spell;
import fantasywar.charactertools.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class PlayerTest {
    private Player player1;
    private Player player2;
    private Knight knight;
    private Wizard wizard;
    private Warlock warlock;

    @Before
    public void before(){
        wizard = new Wizard("Ganadalf",100, Spell.FROSTRUNE, Creature.DRAGON);

        knight = new Knight("Himan", 10, Weapon.SPEAR);
        warlock = new Warlock("Ganadalf",100, Spell.FROSTRUNE, Creature.DRAGON);
        ArrayList characters = new ArrayList<>();
        player1 = new Player();
        player2 = new Player();

        player1.playCharacter(knight);
        player1.playCharacter(warlock);


    }


    @Test
    public void hasCharacters(){
        assertEquals(2, player1.charactersSize());

    }

    @Test
    public void canSetCharacters(){
        ArrayList character = new ArrayList<>();
        player2.setCharacters(character);
        player2.playCharacter(knight);
        assertEquals(1, player2.charactersSize());

    }
    @Test
    public void canFightUsingCharacter(){
        assertEquals(14, player1.fightUsingCharacter(warlock));

    }



    @Test
    public void hasCharactersSize(){
        player1.playCharacter(knight);
        assertEquals(3, player1.charactersSize());

    }


    @Test
    public void canChangeCharacter(){
        // setup
      List<IFight> expectedCharacters = Collections.singletonList(wizard);
       // List<IFight> expectedCharacters = new ArrayList<>();
        //expectedCharacters.add(wizard);
        List<IFight> initialCharacter = new ArrayList<>();
        initialCharacter.add(knight);
        player2.setCharacters(initialCharacter);
        // test
        player2.changeCharacter(wizard);

        // checks
        assertEquals(1, player2.charactersSize());
        assertEquals(expectedCharacters, player2.getCharacters());
    }



}
