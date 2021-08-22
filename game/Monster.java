package game;

public abstract class Monster implements Creature {
    String name;
    int hp;

    public abstract void attack(Character m);

    public abstract void run();
}