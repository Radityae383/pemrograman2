package Pertemuan7_Interface;

public class Lampu implements SmartDevice {

    private int brightness = 0;
    private boolean status = false;

    @Override
    public void powerOn() {
        status = true;
        System.out.println("Lampu dinyalakan.");
    }

    @Override
    public void powerOff() {
        status = false;
        System.out.println("Lampu dimatikan.");
    }

    @Override
    public void increaseLevel() {
        if(status){
            brightness++;
            System.out.println("Brightness lampu meningkat ke level: " + brightness);
        } else {
            System.out.println("Nyalakan lampu dulu!");
        }
    }

    @Override
    public void decreaseLevel() {
        if(status && brightness > 0){
            brightness--;
            System.out.println("Brightness lampu menurun ke level: " + brightness);
        } else {
            System.out.println("Brightness sudah minimum atau lampu mati!");
        }
    }
}

