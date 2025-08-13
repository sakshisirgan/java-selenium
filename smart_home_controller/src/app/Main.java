package app;

import controller.DeviceController;
import devices.SmartAC;
import devices.SmartDevice;
import devices.SmartFan;
import devices.SmartLight;
import devices.SmartTV;

public class Main {
    public static void main(String[] args) {
        DeviceController controller = new DeviceController();

        SmartDevice light = new SmartLight();
        SmartDevice fan = new SmartFan();
        SmartDevice ac = new SmartAC();
        SmartDevice tv = new SmartTV();

        SmartDevice[] devices = {light, fan, ac, tv};
        
        for (SmartDevice device : devices) {
            controller.turnOnDevice(device);
            controller.increaseDeviceSetting(device);
            controller.decreaseDeviceSetting(device);
            controller.turnOffDevice(device);
        }
     }  
}
