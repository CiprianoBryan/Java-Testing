package com.tata.javatests.player;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void loose() {
        Dice dice = new Dice(6);
        Player player = new Player(dice, 3);
        assertFalse(player.play());
    }

    @Test
    public void win() {
        Dice dice = new Dice(6);
        Player player = new Player(dice, 3);
        assertTrue(player.play());
    }
}