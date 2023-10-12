package lab7.finaltask.first.Interfaces;

public class WalkStrategy implements MovementStrategy {
    @Override
    public int speed() {
        return 1;
    }
    @Override
    public String movement() {
        return "Hero is walking";
    }
}
