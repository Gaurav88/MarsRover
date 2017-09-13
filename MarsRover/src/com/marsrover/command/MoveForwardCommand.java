package com.marsrover.command;

import com.marsrover.rover.Rover;

public class MoveForwardCommand implements Command {
    @Override
    public void execute(Rover rover) {
        switch (rover.getDirection()) {
            case EAST:
                moveright(rover);
                break;
            case WEST:
                moveLeft(rover);
                break;
            case NORTH:
                moveUp(rover);
                break;
            case SOUTH:
                moveDown(rover);
                break;
        }
    }

    private void moveLeft(Rover rover) {
        rover.setXpos(rover.getXpos() - 1);
    }

    private void moveright(Rover rover) {
        rover.setXpos(rover.getXpos() + 1);
    }

    private void moveUp(Rover rover) {
        rover.setYpos(rover.getYpos() + 1);
    }

    private void moveDown(Rover rover) {
        rover.setYpos(rover.getYpos() - 1);
    }
}
