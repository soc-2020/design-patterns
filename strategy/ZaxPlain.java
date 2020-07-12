package strategy;

public class ZaxPlain implements Movable {

    public static enum Direction {NORTH, SOUTH, EAST, WEST}
    public static enum Speed {FAST, SLOW, STOP}

    private Direction direction;
    private Speed speed;
    private int posX;
    private int posY;

    public ZaxPlain() {
        direction = Direction.NORTH;
        speed = Speed.SLOW;
        posX = 500;
        posY = 400;
    }

    public void move() {
        int step;
        if(speed == Speed.FAST) {
            step = 3;
        }
        else if(speed == Speed.SLOW) {
            step = 1;
        }
        else {
            step = 0;
        }

        if(direction == Direction.NORTH) {
            posY -= step;
        }
        else if(direction == Direction.SOUTH) {
            posY += step;
        }
        else if(direction == Direction.EAST) {
            posX -= step;
        }
        else if(direction == Direction.WEST) {
            posX += step;
        }
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }
}
