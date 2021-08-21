package Practice10;

public class PoisonMatango extends Matango {
    int limPoison = 5;

    public PoisonMatango(char c) {
        super(c);
    }

    public void attack(Hero h) {
        super.attack(h);
        if (limPoison > 0) {
            System.out.println("さらに毒の胞子をばらまいた！");
            System.out.println(h.hp / 5 + "ポイントのダメージ！");
            h.hp -= h.hp / 5;
            this.limPoison--;
        }
    }
}
