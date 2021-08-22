package Practice13;

public class Hero {
    int hp;
    String name;
    static int money;

    public Hero() {
        hp = 50;
        name = "minato";
    }

    public void setHp(int num) {
        hp = num;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }
}