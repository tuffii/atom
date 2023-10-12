package lab7.finaltask.first.Interfaces;

public class RideAHorseInterface implements MovementStrategy {
    @Override
    public int speed() {
        return 6;
    }
    @Override
    public String movement() {
        return "Hero is riding a horse";
    }
}
