package org.example.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        //zwraca enum dnia tygodnia
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek);

        //zwraca ile dni minelo od poczatku roku
        int dayOfYear = localDate.getDayOfYear();
        System.out.println(dayOfYear);

        //zwraca ile dni minelo od poczatku miesiaca
        int dayOfMonth = localDate.getDayOfMonth();
        System.out.println(dayOfMonth);

        LocalDate localDateNew = localDate.minusDays(1);
        System.out.println("Czy pierwsza data jest wczesniejsza od drugiej? " + localDate.isBefore(localDateNew));

        System.out.println(localDateNew.getMonthValue());
        System.out.println(localDateNew.getDayOfWeek());
        System.out.println(localDateNew.getMonth());
        System.out.println(localDateNew.getYear());

        //LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
       // SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:mm:ss dd.MM.yyyy");
        System.out.println(formatter1.format(localDateTime));

        int hour = localDateTime.getHour();
        int minute = localDateTime.getMinute();
        int second = localDateTime.getSecond();
        System.out.println("Obecna godzina: " + hour);
        System.out.println("Obecna minuta: " + minute);
        System.out.println("Obecna sekunda: " + second);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyy-MM-dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String textDateOne = "1990-02-08";
        String textDateTwo = "2005-12-16";
        String textDateThree = "1990-02-08";

        LocalDate dateOne = LocalDate.parse(textDateOne, formatter2);
        System.out.println(formatter3.format(dateOne));

        LocalDate dateTwo = LocalDate.parse(textDateTwo, formatter2);
        System.out.println(formatter3.format(dateTwo));

        LocalDate dateThree = LocalDate.parse(textDateThree, formatter2);
        System.out.println(formatter3.format(dateThree));

    }
}
