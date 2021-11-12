package Practice.Part3;

import java.util.*;

public class Toi3 {

    public static void main(String[] args) {

        HashMap<Hero, Integer> map = new HashMap<>();

        Hero saito = new Hero("saito");
        Hero suzuki = new Hero("suzuki");

        map.put(saito, 3);
        map.put(suzuki, 7);

        for (Hero h : map.keySet()) {
            int num = map.get(h);
            System.out.println(h.getName() + "が倒した敵の数=" + num);
        }
    }
}