package io.github.mechevo.common.util;

import net.minecraft.util.Direction;
import net.minecraft.util.Direction.Axis;

public class MechDirectionHelper {

    public static Direction rotateAround(Direction dir, Axis axis) {
        switch (axis) {
            case X:
                if (dir != Direction.WEST && dir != Direction.EAST) {
                    return rotateX(dir);
                }

                return dir;
            case Y:
                if (dir != Direction.UP && dir != Direction.DOWN) {
                    return dir.rotateY();
                }

                return dir;
            case Z:
                if (dir != Direction.NORTH && dir != Direction.SOUTH) {
                    return rotateZ(dir);
                }

                return dir;
            default:
                throw new IllegalStateException("Unable to get CW facing for axis " + axis);
        }
    }

    public static Direction rotateX(Direction dir) {
        switch (dir) {
            case NORTH:
                return Direction.DOWN;
            case EAST:
            case WEST:
            default:
                throw new IllegalStateException("Unable to get X-rotated facing of " + dir);
            case SOUTH:
                return Direction.UP;
            case UP:
                return Direction.NORTH;
            case DOWN:
                return Direction.SOUTH;
        }
    }

    public static Direction rotateZ(Direction dir) {
        switch (dir) {
            case EAST:
                return Direction.DOWN;
            case SOUTH:
            default:
                throw new IllegalStateException("Unable to get Z-rotated facing of " + dir);
            case WEST:
                return Direction.UP;
            case UP:
                return Direction.EAST;
            case DOWN:
                return Direction.WEST;
        }
    }

    public static Direction getPositivePerpendicular(Axis horizontalAxis) {
        return horizontalAxis == Axis.X ? Direction.SOUTH : Direction.EAST;
    }
}
