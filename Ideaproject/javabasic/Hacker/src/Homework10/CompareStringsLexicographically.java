package Homework10;

import java.util.Scanner;

public class CompareStringsLexicographically {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first line of text:");
        String fl1 = sc.nextLine();
        System.out.println("Please enter the second line of text:");
        String fl2 = sc.nextLine();
        int result = fl1.compareTo(fl2);
        if(result ==0){
            System.out.println('"' +fl1 + '"' + " have the same strings lexicographically to " + '"' + fl2 + '"');
        }else if(result < 0){
            System.out.println('"' +fl1 + '"' + " is less than " + '"' + fl2 + '"');
        }else{
            System.out.println('"' + fl1 + '"' + " is more than " + '"' + fl2 + '"');
        }
    }
}
