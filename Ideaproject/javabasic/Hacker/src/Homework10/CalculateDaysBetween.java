package Homework10;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateDaysBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first date (dd/mm/yyyy): ");
        LocalDate firstDate = LocalDate.parse(sc.nextLine());
        System.out.print("Enter the second date(dd/mm/yyyy): ");
        LocalDate SecondDate = LocalDate.parse(sc.nextLine());
        Period result = Period.between(firstDate, SecondDate);
        System.out.println(result.getYears() + " years, " + result.getMonths() + " months, " + result.getDays() + " days");
    }
}
