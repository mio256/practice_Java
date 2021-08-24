package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<Integer> points = new ArrayList<>();
        points.add(10);
        points.add(80);
        points.add(75);

        Iterator<Integer> i = points.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
