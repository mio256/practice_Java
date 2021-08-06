package practice;

public class PracticeSwitch {
    public static void main(String[] args) {
        int r = new java.util.Random().nextInt(5);
        System.out.println("predict>>");
        switch (r) {
            case 0:
                System.out.println("very good");
                break;
            case 1:
                System.out.println("good");
                break;
            case 2:
                System.out.println("petty good");
                break;
            case 3:
                System.out.println("normal");
                break;
            case 4:
                System.out.println("bad");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
