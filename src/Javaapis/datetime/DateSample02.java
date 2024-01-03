package Javaapis.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateSample02 {

    public static void main(String[] args) {
        //現在日時の取得と表示
        LocalDateTime dateTime = LocalDateTime.now();

        //日時のフォーマット
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String str = dateTime.format(formatter);
        System.out.println(str);

    }

}
