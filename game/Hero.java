package game;

public class Hero extends Character {
    final int damage = 10;

    @Override
    public void attack(Monster m) {
        System.out.println(this.name + "の攻撃！" + m.name + "に" + damage + "ダメージ！");
        m.hp -= damage;
    }

    @Override
    public void run() {
        System.out.println(this.name + "は逃げ出した！");
    }
}