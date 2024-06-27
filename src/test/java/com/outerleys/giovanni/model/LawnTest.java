package com.outerleys.giovanni.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LawnTest {

    private Lawn lawn;

    @BeforeEach
    void setUp()
    {
        // Create a new lawn with width 5 and height 5
        lawn = new Lawn(5, 5);
    }

    @Test
    void testGetWidth()
    {
        // Check if the width of the lawn is 5
        assert(lawn.getWidth() == 5);
    }

    @Test
    void testGetHeight()
    {
        // Check if the height of the lawn is 5
        assert(lawn.getHeight() == 5);
    }
}
