package Pertemuan7_Interface;

public class AC implements SmartDevice {

    private int temperature = 24;
    private boolean status = false;

    @Override
    public void powerOn() {
        status = true;
        System.out.println("AC dihidupkan.");
    }

    @Override
    public void powerOff() {
        status = false;
        System.out.println("AC dimatikan.");
    }

    @Override
    public void increaseLevel() {
        if(status){
            temperature--;
            System.out.println("Suhu AC diturunkan → " + temperature + "°C");
        } else {
            System.out.println("Hidupkan AC terlebih dahulu!");
        }
    }

    @Override
    public void decreaseLevel() {
        if(status){
            temperature++;
            System.out.println("Suhu AC dinaikkan → " + temperature + "°C");
        } else {
            System.out.println("Hidupkan AC terlebih dahulu!");
        }
    }
}
