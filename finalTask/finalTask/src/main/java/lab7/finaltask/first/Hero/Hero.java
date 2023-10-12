package lab7.finaltask.first.Hero;

import lab7.finaltask.first.Interfaces.*;

public class Hero {
  int speed;
  int currentLocation;

  public Hero() {
    speed = 0;
    currentLocation = 0;
  }

  public void changeMovementStrategy(MovementStrategy strategy) {
    speed = strategy.speed();
    System.out.println(strategy.movement());
  }

  public void move() {
    if (speed != 0) {
      currentLocation += speed;
      System.out.println("Hero is in " + currentLocation + " now");
    } else {
      System.out.println("Hero is staying");
    }
  }

  public void moveBack() {
    if (speed == 0) {
      System.out.println("Hero is staying");
    } else if (currentLocation - speed >= 0) {
      currentLocation -= speed;
      System.out.println("Hero is in " + currentLocation + " now");
    } else if (currentLocation == 0) {
      System.out.println("Current location is 0 already");
    } else {
      currentLocation = 0;
      System.out.println("Hero can`t go back, current location is 0 now");
    }
  }

  public String getStats() {
    String stats = "";
    stats += "speed = " + speed + "\n\t\t location = " + currentLocation + '\n';
    return stats;
  }
}
