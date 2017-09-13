package com.marsrover.grid;

import com.marsrover.rover.Rover;

public class Grid {
    private int length;
    private int breadth;
    private Rover rover[][];

    public Grid(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        rover = new Rover[length][breadth];
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public Rover[][] getRover() {
        return rover;
    }

    public void setRover(Rover[][] rover) {
        this.rover = rover;
    }
}
