package gameTests;

import fantasywar.Player;
import fantasywar.characters.magicians.Warlock;
import fantasywar.characters.magicians.Wizard;
import fantasywar.characters.warriors.Knight;
import fantasywar.charactertools.Creature;
import fantasywar.charactertools.Spell;
import fantasywar.charactertools.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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
        player1 = new Player("Bob");
        player2 = new Player("Dan");

    }


    @Test
    public void hasCharacter(){
        assertEquals(null, player1.getCharacter());

    }

    @Test
    public void canSetCharacter(){
        player1.setCharacter(knight);
        assertEquals(knight, player1.getCharacter());

    }
    @Test
    public void canFightUsingCharacter(){
        player2.setCharacter(warlock);
        assertEquals(4, player2.fightUsingCharacter());

    }

    @Test
    public void canDefendUsingCharacter(){
        player2.setCharacter(warlock);
        assertEquals(2, player2.defendUsingCharacter());

    }

    @Test
    public void canSubtractHealth(){
        warlock = new Warlock("Ganadalf",100, Spell.FROSTRUNE, Creature.DRAGON);
        knight = new Knight("Himan", 10, Weapon.SPEAR);
        player2.setCharacter(warlock);
        int healthToLoose = 6;
        assertEquals(94, player2.subtractHealth(healthToLoose));

    }
    @Test
    public void canAddHealth(){
        warlock = new Warlock("Ganadalf",100, Spell.FROSTRUNE, Creature.DRAGON);
        knight = new Knight("Himan", 10, Weapon.SPEAR);
        player2.setCharacter(knight);
        int healthToAdd = 4;
        assertEquals(14, player2.addHealth(healthToAdd));

    }
    @Test
    public void canGetPlayerLevel(){
        warlock = new Warlock("Ganadalf",90, Spell.TESTSPELL, Creature.OGRE);
        warlock.setLevel(1);
        player1.setCharacter(warlock);
        assertEquals(1, player1.playerLevel());
    }
    @Test
    public void canAddLevel(){
        warlock = new Warlock("Ganadalf",90, Spell.TESTSPELL, Creature.OGRE);
        warlock.setLevel(1);
        player1.setCharacter(warlock);
        assertEquals(2, player1.addLevel());
    }
    @Test

    public void canSubstractLevel(){
        warlock = new Warlock("Ganadalf",90, Spell.TESTSPELL, Creature.OGRE);
        warlock.setLevel(1);
        player1.setCharacter(warlock);
        assertEquals(0, player1.subtractLevel());
    }

}
