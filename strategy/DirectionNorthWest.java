package strategy;

public class DirectionNorthWest implements DirectionBehaviour {
    @Override
    public int nextX(int x, int step) {
        return x - step;
    }

    @Override
    public int nextY(int y, int step) {
        return y - step;
    }
}
