package org.example.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Employee employeeOne = new Employee("Jan", "Nowicki", LocalDate.parse("2000", formatter));

        Employee employeeTwo = new Employee("Natalia", "Oryńska", LocalDate.of(1993, 3, 11));
        Employee employeeThree = new Employee("Kacper", "Myszkowski", LocalDate.of(1995, 4, 1));
    }
}
