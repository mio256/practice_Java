package Practice.Part2;

import java.text.SimpleDateFormat;
import java.util.*;

public class Toi1 {

    public static void main(String[] args) {

        Date s = new Date();

        System.out.println(s.toString());

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(s);

        System.out.println(calendar.toString());

        int day = calendar.get(Calendar.DAY_OF_MONTH);

        day += 100;
        calendar.set(Calendar.DAY_OF_MONTH, day);

        System.out.println(calendar.toString());

        Date future = calendar.getTime();

        SimpleDateFormat format = new SimpleDateFormat("西暦yyyy年MM月dd日");
        System.out.println(format.format(future));
    }
}