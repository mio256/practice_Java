package practice;

import java.util.Calendar;
import java.util.Date;

public class DataCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2011, 7, 22, 1, 23, 45);
        c.set(Calendar.MONTH, 8);
        Date d = c.getTime();
        System.out.println(d);
        Date now = new Date();
        c.setTime(now);
        System.out.println(now);
    }
}