package com.outerleys.giovanni.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MowerTest {

    private Mower mower;

    @BeforeEach
    void setUp()
    {
        // Create a new mower at position (0, 0) facing North
        mower = new Mower(0, 0, 'N');
    }

    @Test
    void testTurnLeft()
    {
        // Turn the mower to the left
        mower.turnLeft();
        // Check if the mower is facing West
        assert(mower.getOrientation() == 'W');
    }

    @Test
    void testTurnRight()
    {
        // Turn the mower to the right
        mower.turnRight();
        // Check if the mower is facing East
        assert(mower.getOrientation() == 'E');
    }

    @Test
    void testMoveForward()
    {
        // Move the mower forward
        mower.moveForward(5, 5);
        // Check if the mower is at position (0, 1)
        assert(mower.getX() == 0 && mower.getY() == 1 && mower.getOrientation() == 'N');
    }


}
