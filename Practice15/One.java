package Practice15;

public class One {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String str = new String();
        for (int i = 1; i <= 10000; i++) {
            str = str + "HelloWorld.";
        }
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            sb.append("HelloWorld.");
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
