package Practice13;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public String getName() {
        return name;
    }

    public void setHp(int num) {
        hp = num;
    }

    public void setMp(int num) {
        mp = num;
    }

    public String setName() {
        return name;
    }

    void heal(Hero h) {
        final int basePoint = 10;
        final int recovPoint = (int) (basePoint * this.wand.getPower());
        h.setHp(h.getHp() + recovPoint);
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
    }
}
