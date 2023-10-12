package lab7.finaltask.first.Interfaces;

public class StayInterface implements MovementStrategy {
    @Override
    public int speed() {
        return 0;
    }
    @Override
    public String movement() {
        return "Hero is staying";
    }
}
