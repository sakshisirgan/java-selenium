package devices;

public class SmartLight implements SmartDevice, Adjustable {
    private boolean isOn;
    private int brightness;

    public SmartLight() {
        this.isOn = false;
        this.brightness = 30;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Light turned ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Light turned OFF.");
    }

    @Override
    public void increaseSetting() {
        if (brightness < 100) {
            ++brightness;
            System.out.println("Brightness increased to " + brightness);
        }
    }

    @Override
    public void decreaseSetting() {
        if (brightness > 0) {
            --brightness;
            System.out.println("Brightness decreased to " + brightness);
        }
    }
}
