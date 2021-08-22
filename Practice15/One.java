package Practice15;

public class One {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            sb.append(i);
            sb.append(",");
        }
        String s = sb.toString();
        System.out.println(s);
        String[] a = s.split(",");
        for (String sa : a) {
            System.out.println(sa);
        }
    }
}
