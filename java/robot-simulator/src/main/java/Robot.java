import java.util.Objects;

public class Robot {

    private Orientation orientation;
    private GridPosition position;

    public Robot(GridPosition position, Orientation orientation){

        Objects.requireNonNull(position);
        Objects.requireNonNull(orientation);

        this.position = position;
        this.orientation = orientation;
    }

    public void turnRight() {
        switch(orientation) {
            case NORTH:
                orientation = Orientation.EAST;
                break;
            case EAST:
                orientation = Orientation.SOUTH;
                break;
            case SOUTH:
                orientation = Orientation.WEST;
                break;
            case WEST:
                orientation = Orientation.NORTH;
                break;
        }
    }

    public void turnLeft() {
        switch(orientation) {
            case NORTH:
                orientation = Orientation.WEST;
                break;
            case WEST:
                orientation = Orientation.SOUTH;
                break;
            case SOUTH:
                orientation = Orientation.EAST;
                break;
            case EAST:
                orientation = Orientation.NORTH;
                break;
        }
    }

    public void advance() {

        switch(orientation) {
            case NORTH:
                position = fromHere(position, 0, 1);
                break;
            case EAST:
                position = fromHere(position, 1, 0);
                break;
            case SOUTH:
                position = fromHere(position, 0, -1);
                break;
            case WEST:
                position = fromHere(position, -1, 0);
                break;
        }
    }

    public void simulate(String directions) {

        // this only works as the directions are ASCII
        for (var direction: directions.toCharArray()) {
            switch(direction) {
                case 'R':
                    turnRight();
                    break;
                case 'L':
                    turnLeft();
                    break;
                case 'A':
                    advance();
                    break;
                default:
                    // input not valid
                    break;
            }
        }
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public GridPosition getGridPosition() {
        return position;
    }

    // I've had to put a method in this class instead of in 'GridPosition' to be able
    // to return an updated object based on itself
    //
    // All local tests had passed but online submission failed so ¯\_(ツ)_/¯
    private GridPosition fromHere(GridPosition position, int xIncrement, int yIncrement){

        var newX = position.x + xIncrement;
        var newY = position.y + yIncrement;

        return new GridPosition(newX, newY);
    }
}
