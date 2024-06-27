package com.outerleys.giovanni.model;

public class Lawn {

    private int width, height;

    /*
     * Constructor
     * @param width: width of the lawn
     * @param height: height of the lawn
     */
    public Lawn(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    /*
     * Get the width of the lawn
     * @return width of the lawn
     */
    public int getWidth()
    {
        return width;
    }

    /*
     * Get the height of the lawn
     * @return height of the lawn
     */
    public int getHeight()
    {
        return height;
    }

}
