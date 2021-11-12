package Practice.Part2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Toi2 {

    public static void main(String[] args) {

        LocalDateTime time = LocalDateTime.now();
        LocalDateTime afterTime = time.plusDays(100);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
        System.out.println(afterTime.format(f));
    }
}