package devices;

public class SmartAC implements SmartDevice, Adjustable {
    private boolean isOn;
    private int temperature; 

    public SmartAC() {
        this.isOn = false;
        this.temperature = 22;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("AC turned ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("AC turned OFF.");
    }

    @Override
    public void increaseSetting() {
        if (temperature < 25) {
            ++temperature;
            System.out.println("Temperature increased to " + temperature + "°C");
        }
    }

    @Override
    public void decreaseSetting() {
        if (temperature > 15) {
            --temperature;
            System.out.println("Temperature decreased to " + temperature + "°C");
        }
    }
}
