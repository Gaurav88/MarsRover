package com.marsrover.rover;

import com.marsrover.common.Direction;

public class Rover {
    private int xpos;
    private int ypos;
    private Direction direction;

    public Rover(int xpos, int ypos, Direction direction) {
        this.xpos = xpos;
        this.ypos = ypos;
        this.direction = direction;
    }

    public int getXpos() {
        return xpos;
    }

    public int getYpos() {
        return ypos;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setXpos(int xpos) {
        this.xpos = xpos;
    }

    public void setYpos(int ypos) {
        this.ypos = ypos;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
