package org.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String nameOne = "Jan";
        String nameTwo = "Bar bara";

//        String stringPattern = "[A-Z][a-z]+";
//        Pattern pattern = Pattern.compile(stringPattern);

        Pattern pattern = Pattern.compile("[A-Z][a-z ]+");
        Matcher matcherOne = pattern.matcher(nameOne);
        Matcher matcherTwo = pattern.matcher(nameTwo);
        System.out.println("Czy pierwczy ciag odpowiada wzorcowi: " + matcherOne.matches());
        System.out.println("Czy drugi ciag odpowiada wzorcowi: " + matcherTwo.matches());

        String textOne = "Hello_World_10";
        Pattern patternThee = Pattern.compile("[A-Za-z_0-9]+");

        Matcher matcherThree = patternThee.matcher(textOne);
        System.out.println("Czy drugi ciag odpowiada wzorcowi: " + matcherThree.matches());


        String dateOne = "01-02-2023";
        String dateTwo = "14:03:2021";
        String dateThree = "26/06/2022";
        String dateFour = "19/01/1918";
        String dateFive = "23.19.1997";

        //0?[1-9] = 01, 02
        //[12][0-9] - 10, 11, 12-19, 20, 21, 22-29
        //3[01] - 30, 31

        //1[012] - 10, 11, 12
        //d{4} - zawiera 4 cyfry, ale nie sprawdzamy jakie
        String regex = "(0?[1-9]|[12][0-9]|3[01])[-:/.](0?[1-9]|1[012])[-:/.]\\d{4}";
        Pattern patternDate = Pattern.compile(regex);

        Matcher matcherDateOne = patternDate.matcher(dateOne);
        System.out.println("Czy ciag znakow odpowiada wzorcowi: " + matcherDateOne.matches());

        Matcher matcherDateTwo = patternDate.matcher(dateTwo);
        System.out.println("Czy ciag znakow odpowiada wzorcowi: " + matcherDateTwo.matches());

        Matcher matcherDateThree = patternDate.matcher(dateThree);
        System.out.println("Czy ciag znakow odpowiada wzorcowi: " + matcherDateThree.matches());

        Matcher matcherDateFour = patternDate.matcher(dateFour);
        System.out.println("Czy ciag znakow odpowiada wzorcowi: " + matcherDateFour.matches());

        Matcher matcherDateFive = patternDate.matcher(dateFive);
        System.out.println("Czy ciag znakow odpowiada wzorcowi: " + matcherDateFive.matches());


        String regexWithYear = "(0?[1-9]|[12][0-9]|3[01])[-:/.](0?[1-9]|1[012])[-:/.](19[7-9][0-9]|(20[0-1][0-9]|202[0-3]))";
        Pattern patternDateWithYear = Pattern.compile(regexWithYear);

        Matcher matcherDateOneWithYear = patternDateWithYear.matcher(dateOne);
        System.out.println("Czy ciag znakow odpowiada wzorcowi: " + matcherDateOneWithYear.matches());

        Matcher matcherDateFiveWithYear = patternDateWithYear.matcher(dateOne);
        System.out.println("Czy ciag znakow odpowiada wzorcowi: " + matcherDateFiveWithYear.matches());
    }
}
