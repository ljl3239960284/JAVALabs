package Homework10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AandBNowday10Days {
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        LocalDate tenDaysago = today.minusDays(10);
        LocalDate tenDaysLater = today.plusDays(10);
        int currentYear = today.getYear();
        LocalDate birthday = LocalDate.of(currentYear,07,15);
        long daysBetween = ChronoUnit.DAYS.between(today,birthday);
        System.out.println("current date: " + today);
        System.out.println("10 days before today will be"  + tenDaysago);
        System.out.println("10 days after today will be " + tenDaysLater);
        System.out.println("just  " + daysBetween + " days until your birthday");
    }
}
