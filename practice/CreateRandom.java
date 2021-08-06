package practice;

public class CreateRandom {
    public static void main(String[] args) {
        int r = new java.util.Random().nextInt(10);

        System.out.println("your age is " + r + " Right?");
    }
}
