package com.tata.javatests.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void loose() {
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);
        Player player = new Player(dice, 3);
        assertFalse(player.play());
    }

    @Test
    public void win() {
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(5);
        Player player = new Player(dice, 3);
        assertTrue(player.play());
    }
}