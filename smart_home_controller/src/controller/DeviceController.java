package controller;

import devices.SmartDevice;
import devices.Adjustable;

public class DeviceController {

    public void turnOnDevice(SmartDevice device) {
        device.turnOn();
    }

    public void turnOffDevice(SmartDevice device) {
        device.turnOff();
    }

    public void increaseDeviceSetting(SmartDevice device) {
        if (device instanceof Adjustable) {
            ((Adjustable) device).increaseSetting();
        } else {
            System.out.println("This device does not support adjustable settings.");
        }
    }

    public void decreaseDeviceSetting(SmartDevice device) {
        if (device instanceof Adjustable) {
            ((Adjustable) device).decreaseSetting();
        } else {
            System.out.println("This device does not support adjustable settings.");
        }
    }
}
