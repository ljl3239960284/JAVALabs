package Homework10;

import java.util.Scanner;

public class ContainsString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a line of text:");
        String line = sc.nextLine();
        System.out.println("Please enter the keyword to search for:");
        String keyword = sc.nextLine();
        boolean result = line.contains(keyword);
        System.out.println(result);
    }
}
