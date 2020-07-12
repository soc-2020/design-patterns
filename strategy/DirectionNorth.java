package strategy;

public class DirectionNorth implements DirectionBehaviour {
    @Override
    public int nextX(int x, int step) {
        return x;
    }

    @Override
    public int nextY(int y, int step) {
        return y - step;
    }
}
