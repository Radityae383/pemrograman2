public class main_utama {
    public static void main(String[] args) {
        Enemy radit = new Enemy("Radit", 100, 50);
        Burung moloch = new Burung("Moloch", 80, 30);
        pocong mumun = new pocong("Mumun", 90, 40);
        zombie sadimin = new zombie("Sadimin", 120, 25);

        // Radit
        radit.displayStatus();
        radit.attack(moloch);
        System.out.println("-------------------------------------------------");

        // Moloch
        moloch.displayStatus();
        moloch.fly();
        moloch.jump();
        moloch.walk();
        moloch.attack(sadimin);
        System.out.println("-------------------------------------------------");

        // Mumun
        mumun.displayStatus();
        mumun.jump();
        mumun.roll();
        mumun.attack(radit);
        System.out.println("-------------------------------------------------");

        // Sadimin
        sadimin.displayStatus();
        sadimin.walk();
        sadimin.groan();
        sadimin.attack(mumun);
        System.out.println("-------------------------------------------------");
    }
}
