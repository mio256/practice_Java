package practice.secondgame;

public class Computer {
    String name;
    int price;
    String color;
    String makerName;

    public Computer(String name, int price, String color, String makerName) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.makerName = makerName;
    }

    public int getPrice() {
        return this.price;
    }

    public String getColor() {
        return this.color;
    }

    public String getMakerName() {
        return this.makerName;
    }
}
