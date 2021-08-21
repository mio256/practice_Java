package practice.firstgame;

public class SuperHero extends Hero {
    String name; // declaration name
    int hp; // declaration hp
    Sword sword;
    boolean flying;

    public void fly() {
        this.flying = true;
        System.out.println("fly!");
    }

    public void land() {
        this.flying = false;
        System.out.println("fly!");
    }

    public void run() {
        System.out.println(this.name + "is retire.");
    }
}
