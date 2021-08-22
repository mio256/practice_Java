package game;

public abstract class Character implements Creature {
    String name;
    int hp;

    public abstract void attack(Monster m);

    public abstract void run();
}