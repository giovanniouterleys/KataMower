package com.outerleys.giovanni.model;

public class Mower {
    private int x, y;
    private char orientation;

    /*
     * Constructor
     * @param x: x coordinate of the mower
     * @param y: y coordinate of the mower
     * @param orientation: orientation of the mower
     */
    public Mower(int x, int y, char orientation)
    {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    /*
     * Get the x coordinate of the mower
     * @return x coordinate of the mower
     */
    public int getX()
    {
        return x;
    }

    /*
     * Get the y coordinate of the mower
     * @return y coordinate of the mower
     */
    public int getY()
    {
        return y;
    }

    /*
     * Get the orientation of the mower
     * @return orientation of the mower
     */
    public char getOrientation()
    {
        return orientation;
    }

    /*
     * Change the orientation of the mower to the left
     */
    public void turnLeft()
    {
        switch (orientation)
        {
            case 'N':
                orientation = 'W';
                break;
            case 'W':
                orientation = 'S';
                break;
            case 'S':
                orientation = 'E';
                break;
            case 'E':
                orientation = 'N';
                break;
        }
    }

    /*
     * Change the orientation of the mower to the right
     */
    public void turnRight()
    {
        switch (orientation)
        {
            case 'N':
                orientation = 'E';
                break;
            case 'E':
                orientation = 'S';
                break;
            case 'S':
                orientation = 'W';
                break;
            case 'W':
                orientation = 'N';
                break;
        }
    }

    /*
     * Move the mower forward
     */
    public void moveForward(int maxX, int maxY) {
        switch (orientation) {
            case 'N':
                if (y < maxY) {
                    y++;
                } else {
                    System.err.println("Attempt to move out of bounds at " + this);
                }
                break;
            case 'E':
                if (x < maxX) {
                    x++;
                } else {
                    System.err.println("Attempt to move out of bounds at " + this);
                }
                break;
            case 'S':
                if (y > 0) {
                    y--;
                } else {
                    System.err.println("Attempt to move out of bounds at " + this);
                }
                break;
            case 'W':
                if (x > 0) {
                    x--;
                } else {
                    System.err.println("Attempt to move out of bounds at " + this);
                }
                break;
        }
    }


    // Override the toString method
    @Override
    public String toString()
    {
        return x + " " + y + " " + orientation;
    }
}
