package Homework10;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class CalculateAges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birthday (dd/MM/yyyy): ");
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.parse(sc.nextLine());
        Period period = Period.between(birthday, today);
        System.out.println(period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days");
    }
}
