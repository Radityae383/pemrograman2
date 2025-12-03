package Pertemuan7_Interface;

public class SmartUser {

    private SmartDevice device;

    public SmartUser(SmartDevice device){
        this.device = device;
    }

    public void turnOnDevice(){
        device.powerOn();
    }

    public void makeHigher(){
        device.increaseLevel();
    }

    public void makeLower(){
        device.decreaseLevel();
    }

    public void turnOffDevice(){
        device.powerOff();
    }
}
