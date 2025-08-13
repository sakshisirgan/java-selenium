package devices;

public class SmartTV implements SmartDevice, Adjustable {
    private boolean isOn;
    private int volume;

    public SmartTV() {
        this.isOn = false;
        this.volume = 20;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("TV turned ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("TV turned OFF.");
    }

    @Override
    public void increaseSetting() {
        if (volume < 100) {
            ++volume;
            System.out.println("Volume increased to " + volume);
        }
    }

    @Override
    public void decreaseSetting() {
        if (volume > 0) {
            --volume;
            System.out.println("Volume decreased to " + volume);
        }
    }
}
