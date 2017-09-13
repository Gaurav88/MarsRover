package com.marsrover.calculator;

import com.marsrover.common.Direction;
import com.marsrover.common.Movement;
import com.marsrover.exception.MarsRoverException;
import com.marsrover.grid.Grid;
import com.marsrover.rover.Rover;

public class Navigator {

    private static final int ONE = 1;

    public void getInput(Rover rover, Grid grid, Movement movement) throws MarsRoverException {
        switch (movement) {
            case L:
                rotateLeft(rover);
                break;
            case M:
                moveForward(rover, grid);
                break;
            case R:
                rotateRight(rover);
                break;
        }
    }

    private void rotateLeft(Rover rover) {
        switch (rover.getDirection()) {
            case EAST:
                rover.setDirection(Direction.NORTH);
                break;
            case WEST:
                rover.setDirection(Direction.SOUTH);
                break;
            case NORTH:
                rover.setDirection(Direction.WEST);
                break;
            case SOUTH:
                rover.setDirection(Direction.EAST);
                break;
        }

    }


    private void rotateRight(Rover rover) {
        switch (rover.getDirection()) {
            case EAST:
                rover.setDirection(Direction.SOUTH);
                break;
            case WEST:
                rover.setDirection(Direction.NORTH);
                break;
            case NORTH:
                rover.setDirection(Direction.EAST);
                break;
            case SOUTH:
                rover.setDirection(Direction.WEST);
                break;
        }
    }

    private void moveForward(Rover rover, Grid grid) throws MarsRoverException {
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
