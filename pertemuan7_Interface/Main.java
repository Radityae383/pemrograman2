package Pertemuan7_Interface;

public class Main {
    public static void main(String[] args) {

        SmartDevice lampu = new Lampu();
        SmartDevice ac = new AC();
        SmartDevice speaker = new Speaker();

        SmartUser user1 = new SmartUser(lampu);
        SmartUser user2 = new SmartUser(ac);
        SmartUser user3 = new SmartUser(speaker);

        //Lampu
        System.out.println("=== SMART USER (Lampu) ===");
        user1.turnOnDevice();
        user1.makeHigher();
        user1.makeLower();
        user1.turnOffDevice();
        System.out.println("--------------------------");

        //AC
        System.out.println("=== SMART USER (AC) ===");
        user2.turnOnDevice();
        user2.makeHigher();
        user2.makeLower();
        user2.turnOffDevice();
        System.out.println("--------------------------");

        //Speaker
        System.out.println("=== SMART USER (Speaker) ===");
        user3.turnOnDevice();
        user3.makeHigher();
        user3.makeLower();
        user3.turnOffDevice();
        System.out.println("--------------------------");
    }
}
