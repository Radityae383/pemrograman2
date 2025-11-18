public class Enemy {
    String name;
    int hp;
    int attackPoint;

    public Enemy(String name, int hp, int attackPoint) {
        this.name = name;
        this.hp = hp;
        this.attackPoint = attackPoint;
    }

    public void attack(Enemy target) {
        System.out.println(this.name + " menyerang " + target.name + " dengan " + attackPoint + " damage!");
        target.hp -= attackPoint;
        if (target.hp < 0) target.hp = 0;
        System.out.println(target.name + " sisa HP: " + target.hp);
    }

    public void displayStatus() {
        System.out.println(name + " - HP: " + hp + " - Attack: " + attackPoint);
    }
}
