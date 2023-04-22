package org.example.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataExample {
    public static void main(String[] args) {
        //wartosc w milisekundach od 1 stycznia 1970
        Date date = new Date();
        long timeInMiliSeconds = date.getTime();
        System.out.println("Czas jaki minal od 1.1.1970 w milisekundach: " + timeInMiliSeconds);

        long day = timeInMiliSeconds / (1000 * 60 * 60 * 24);
        System.out.println("Ilosc dni od 1.1.1970: " + day);

        SimpleDateFormat simpleDateformat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        System.out.println("Obecna data oraz godzina: " + simpleDateformat.format(date));
    }
}
