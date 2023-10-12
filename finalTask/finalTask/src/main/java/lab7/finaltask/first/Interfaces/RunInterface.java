package lab7.finaltask.first.Interfaces;

public class RunInterface implements MovementStrategy {
    @Override
    public int speed() {
        return 3;
    }
    @Override
    public String movement() {
        return "Hero is running";
    }
}
