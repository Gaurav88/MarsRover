package com.marsrover.command;

import com.marsrover.common.Direction;
import com.marsrover.rover.Rover;

public class RotateRightCommand implements Command {
    @Override
    public void execute(Rover rover) {
        rover.setDirection(rover.getDirection().getRight());
    }
}
