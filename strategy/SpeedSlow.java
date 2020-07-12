package strategy;

public class SpeedSlow implements SpeedBehaviour {
    @Override
    public int getStep() {
        return 1;
    }
}
