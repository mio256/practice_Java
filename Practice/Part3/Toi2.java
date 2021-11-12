package Practice.Part3;

import java.util.ArrayList;
import java.util.Iterator;

public class Toi2 {

    public static void main(String[] args) {

        ArrayList<Hero> list = new ArrayList<>();
        Hero saito = new Hero("saito");
        Hero suzuki = new Hero("suzuki");
        list.add(saito);
        list.add(suzuki);
        Iterator<Hero> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName().toString());
        }
    }
}