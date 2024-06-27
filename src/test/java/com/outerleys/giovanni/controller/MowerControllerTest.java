package com.outerleys.giovanni.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class MowerControllerTest {

    private final PrintStream standardOut = System.out;
    private ByteArrayOutputStream outputStreamCaptor;

    @BeforeEach
    void setUp() {
        outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void testMowerMoves(@TempDir Path pathDir) {
        try {
            Path inputFilePath = Files.createFile(pathDir.resolve("mvmtest.txt"));
            Files.write(inputFilePath, "5 5\n1 2 N GAGAGAGAA\n3 3 E AADAADADDA".getBytes());

            MowerController.main(new String[]{inputFilePath.toString()});

            String output = outputStreamCaptor.toString().trim();
            assertTrue(output.contains("1 3 N"));
            assertTrue(output.contains("5 1 E"));

        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

}
