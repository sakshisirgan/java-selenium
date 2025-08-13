package devices;

public class SmartFan implements SmartDevice, Adjustable {
    private boolean isOn;
    private int speed;

    public SmartFan() {
        this.isOn = false;
        this.speed = 1;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Fan turned ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Fan turned OFF.");
    }

    @Override
    public void increaseSetting() {
        if (speed < 5) {
            speed++;
            System.out.println("Fan speed increases to " + speed);
        }
    }

    @Override
    public void decreaseSetting() {
        if (speed > 1) {
            speed--;
            System.out.println("Fan speed decreases to " + speed);
        }
    }
}
