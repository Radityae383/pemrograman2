public class Burung extends Enemy {
    public Burung(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }

    public void walk() {
        System.out.println(name + " jalan santai di atas pohon.");
    }

    public void jump() {
        System.out.println(name + " meloncat-loncat lucu.");
    }

    public void fly() {
        System.out.println(name + " terbang tinggi di langit!");
    }
}