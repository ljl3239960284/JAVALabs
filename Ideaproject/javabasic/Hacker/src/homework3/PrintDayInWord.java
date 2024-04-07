package Homework3;

import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("inter day number:");
        int num = scanner.nextInt();
        String dayname;
        switch(num){
            case 1:
                dayname = "Monday";
                break;
            case 2:
                dayname = "Tuesday";
                break;
            case 3:
                dayname = "Wednesday";
                break;
            case 4:
                dayname = "Thursday";
                break;
            case 5:
                dayname = "Friday";
                break;
            case 6:
                dayname = "Saturday";
                break;
            case 0:
                dayname = "Sunday";
                break;
            default:
                dayname = "Not a valid day";

        }
        System.out.print(dayname);
    }
      
    

}
