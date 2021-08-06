package practice;

public class Ren5 {
    public static void main(String[] args) {
        introduceOneself("oishi", 17, 165, '猿');
        email("HelloWorld", "192.168.44.1.1", "proxy broken.");
        email("192.168.44.1.1", "WellcomeHell");
        System.out.println(calcTriangleArea(10.0, 5.0));
        System.out.println(calcCircleArea(5.0));
    }

    public static void introduceOneself(String name, int age, int height, char zodiac) {
        System.out.println(
                "Hey! My name is " + name + ". I am " + age + " old," + height + "m," + zodiac + " is my zodiac.");
    }

    public static void email(String title, String address, String text) {
        System.out.println("Sent email to " + address + ".");
        System.out.println("title:" + title);
        System.out.println("text:" + text);
    }

    public static void email(String address, String text) {
        System.out.println("Sent email to " + address + ".");
        System.out.println("title:No title");
        System.out.println("text:" + text);
    }

    public static double calcTriangleArea(double botom, double height) {
        return botom * height / 2;
    }

    public static double calcCircleArea(double radius) {
        return radius * radius * 3.14;
    }
}
