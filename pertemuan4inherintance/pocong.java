public class pocong extends Enemy {
    public pocong(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }

    public void jump() {
        System.out.println(name + " melompat-lompat menakutkan!");
    }

    public void roll() {
        System.out.println(name + " menggulung tubuhnya dengan cepat!");
    }
}
