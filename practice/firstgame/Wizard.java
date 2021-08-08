package practice.firstgame;

public class Wizard {
    String name; // declaration name
    int hp; // declaration hp

    public void heal(Hero hero_object) {
        final int value = 10;
        hero_object.hp += value;
        System.out.println("heal " + hero_object.name + " by " + value + ".");
    }
}
