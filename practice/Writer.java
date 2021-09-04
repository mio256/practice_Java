package practice;

import java.io.FileWriter;

public class Writer {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt");
            fw.write("hello!");
            fw.close();
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
