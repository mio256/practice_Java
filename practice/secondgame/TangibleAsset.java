package practice.secondgame;

public abstract class TangibleAsset {
    String name;
    int price;
    String color;
    String makerName;

    // public Things() ;

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
