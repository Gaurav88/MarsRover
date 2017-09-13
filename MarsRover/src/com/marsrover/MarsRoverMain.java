package com.marsrover;

import com.marsrover.calculator.Navigator;
import com.marsrover.command.Command;
import com.marsrover.command.MoveForwardCommand;
import com.marsrover.command.RotateLeftCommand;
import com.marsrover.command.RotateRightCommand;
import com.marsrover.common.Direction;
import com.marsrover.common.Movement;
import com.marsrover.exception.MarsRoverException;
import com.marsrover.grid.Grid;
import com.marsrover.rover.Rover;

import java.util.HashMap;
import java.util.Map;

public class MarsRoverMain {
    private static Map<Character, Command> stringToCommandMap = new HashMap<Character, Command>() {{
        put('L', new RotateLeftCommand());
        put('R', new RotateRightCommand());
        put('M', new MoveForwardCommand());
    }};

    public static void main(String[] args) {
        Grid grid = new Grid(5, 5);
        Rover rover = new Rover(1, 2, Direction.NORTH);
        Navigator navigator = new Navigator();
        String str = "LMLMLMLMM";
        for (int i = 0; i < str.length(); i++) {
            try {
                navigator.getInput(rover, grid, convertCharToMovement(str.charAt(i)));

            } catch (MarsRoverException e) {
                e.printStackTrace();
            }
        }
        System.out.println(rover.getXpos() + " " + rover.getYpos() + " " + rover.getDirection() + " ");

        //Grid grid1 = new Grid(3, 3);
        Rover rover1 = new Rover(1, 2, Direction.EAST);
        Navigator navigator1 = new Navigator();
        String str1 = "MMRMMRMRRM";
        for (int i = 0; i < str1.length(); i++) {
            // navigator1.getInput(rover1, grid, convertCharToMovement(str1.charAt(i)));
            stringToCommandMap.get(str1.charAt(i)).execute(rover);

        }
        System.out.println(rover1.getXpos() + " " + rover1.getYpos() + " " + rover1.getDirection() + " ");
    }

    public static Movement convertCharToMovement(char c) {
        Movement m = null;
        switch (c) {
            case 'L':
                m = Movement.L;
                break;
            case 'M':
                m = Movement.M;
                break;
            case 'R':
                m = Movement.R;
                break;
        }
        return m;
    }


}
