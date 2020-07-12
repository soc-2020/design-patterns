package strategy;

public class DirectionWest implements DirectionBehaviour {
    @Override
    public int nextX(int x, int step) {
        return x - step;
    }

    @Override
    public int nextY(int y, int step) {
        return y;
    }
}
