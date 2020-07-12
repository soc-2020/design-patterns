package strategy;

public class SpeedStopped implements SpeedBehaviour {
    @Override
    public int getStep() {
        return 0;
    }
}
