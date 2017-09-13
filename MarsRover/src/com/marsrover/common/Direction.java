package com.marsrover.common;

public enum Direction {
    NORTH {
        @Override
        public Direction getLeft() {
            return WEST;
        }

        @Override
        public Direction getRight() {
            return EAST;
        }
    },
    SOUTH{
        @Override
        public Direction getLeft() {
            return EAST;
        }

        @Override
        public Direction getRight() {
            return WEST;
        }
    },
    EAST{
        @Override
        public Direction getLeft() {
            return NORTH;
        }

        @Override
        public Direction getRight() {
            return SOUTH;
        }
    },
    WEST{
        @Override
        public Direction getLeft() {
            return SOUTH;
        }

        @Override
        public Direction getRight() {
            return NORTH;
        }
    };

    private Direction left;
    private Direction right;


    Direction() {

    }

    public abstract Direction getRight();

    public abstract Direction getLeft();

    Direction(Direction left, Direction right) {
        this.left = left;
        this.right = right;
    }


}
