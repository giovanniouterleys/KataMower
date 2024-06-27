package com.outerleys.giovanni.controller;

import com.outerleys.giovanni.model.Lawn;
import com.outerleys.giovanni.model.Mower;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MowerController {

    public static void main(String[] args) {
        InputStream inputStream = MowerController.class.getClassLoader().getResourceAsStream("movements.txt");

        if (inputStream == null) {
            System.err.println("Error movements.txt file not found.");
            return;
        }

        try (Scanner scanner = new Scanner(inputStream)) {
            try {
                int lawnWidth = scanner.nextInt();
                int lawnHeight = scanner.nextInt();
                Lawn lawn = new Lawn(lawnWidth, lawnHeight);

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine().trim();
                    if (line.isEmpty()) continue;  // Skip empty lines
                    Scanner lineScanner = new Scanner(line);

                    try {
                        int x = lineScanner.nextInt();
                        int y = lineScanner.nextInt();
                        char orientation = lineScanner.next().charAt(0);
                        Mower mower = new Mower(x, y, orientation);
                        if (lineScanner.hasNext()) {
                            String commands = lineScanner.next();
                            for (char command : commands.toCharArray()) {
                                switch (command) {
                                    case 'G':
                                        mower.turnLeft();
                                        break;
                                    case 'D':
                                        mower.turnRight();
                                        break;
                                    case 'A':
                                        mower.moveForward(lawn.getWidth(), lawn.getHeight());
                                        break;
                                }
                            }
                        }
                        System.out.println(mower);
                    } catch (InputMismatchException e) {
                        System.err.println("Invalid mower position or orientation format in line: " + line);
                    } catch (NoSuchElementException e) {
                        System.err.println("Incomplete information for mower in line: " + line);
                    } finally {
                        lineScanner.close();
                    }
                }
            } catch (NoSuchElementException e) {
                System.err.println("Invalid format for lawn dimensions.");
            }
        } catch (Exception e) {
            System.err.println("Error processing the file: " + e.getMessage());
        }
    }
}
