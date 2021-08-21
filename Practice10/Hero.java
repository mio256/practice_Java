package Practice10;

public class Hero {
    String name; // declaration name
    int hp; // declaration hp

    public void sleep() {
        this.hp = 100;
        System.out.println(this.hp + " slept and recoreted.");
    }

    public void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + " sat down.");
        System.out.println("HP recovered by " + sec + ".");
    }

    public final void slip() {
        final int damage = 5;
        this.hp -= damage;
        System.out.println(this.name + " sliped.");
        System.out.println("damage is " + damage + ".");
    }

    public void run() {
        System.out.println(this.name + " run away.");
        System.out.println("GAMEOVER");
        System.out.println("final HP is " + this.hp + ".");
    }

    public Hero(String name) {
        this.hp = 100;
        this.name = name;// reset by argument
    }

    public Hero() {
        this("newHero");
    }
}
