package Practice.Part1;

public class Toi1 {

    public static void main(String[] args) {

        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            s.append(i).append(",");
        }
        System.out.println(s.toString());
        String[] a = s.toString().split(",");

        for (String str : a) {
            System.out.println(str);
        }
    }
}