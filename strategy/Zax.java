package strategy;

public class Zax implements Movable{

    private int posX;
    private int posY;
    private DirectionBehaviour direction;
    private SpeedBehaviour speed;

    public Zax() {
        direction = new DirectionNorth();
        speed = new SpeedSlow();
        posX = 500;
        posY = 400;
    }

    public void move() {
        posX = direction.nextX(posX, speed.getStep());
        posY = direction.nextY(posY, speed.getStep());
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setDirectionBehaviour(DirectionBehaviour direction) {
        this.direction = direction;
    }

    public void setSpeedBehaviour(SpeedBehaviour speed) {
        this.speed = speed;
    }
}
