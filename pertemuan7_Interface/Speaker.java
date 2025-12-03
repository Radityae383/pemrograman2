package Pertemuan7_Interface;

public class Speaker implements SmartDevice {

    private int volume = 0;
    private boolean status = false;

    @Override
    public void powerOn() {
        status = true;
        System.out.println("Speaker menyala.");
    }

    @Override
    public void powerOff() {
        status = false;
        System.out.println("Speaker dimatikan.");
    }

    @Override
    public void increaseLevel() {
        if(status){
            volume++;
            System.out.println("Volume speaker meningkat ke: " + volume);
        } else {
            System.out.println("Speaker belum dinyalakan!");
        }
    }

    @Override
    public void decreaseLevel() {
        if(status && volume > 0){
            volume--;
            System.out.println("Volume speaker menurun ke: " + volume);
        } else {
            System.out.println("Volume sudah minimum atau speaker mati!");
        }
    }
}

