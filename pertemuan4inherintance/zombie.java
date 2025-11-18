public class zombie extends Enemy {
    public zombie(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }

    public void walk() {
        System.out.println(name + " berjalan terseret-seret lambat tapi menyeramkan.");
    }

    public void groan() {
        System.out.println(name + " mengeluarkan suara 'grrrr...'");
    }
}