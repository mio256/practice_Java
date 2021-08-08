package practice.firstgame;

public class Matango {
    int hp; // declaration hp
    final int LEVEL = 10; // declaration level
    char suffix;

    // public void sleep() {
    // this.hp = 100;
    // System.out.println(this.hp + " slept and recoreted.");
    // }

    // public void sit(int sec) {
    // this.hp += sec;
    // System.out.println(this + " sat down.");
    // System.out.println("HP recovered by " + sec + ".");
    // }

    // public void slip() {
    // final int damage = 5;
    // this.hp -= damage;
    // System.out.println(this + " sliped.");
    // System.out.println("damage is " + damage + ".");
    // }

    public void run() {
        System.out.println("matango" + this.suffix + " run away.");
    }
}