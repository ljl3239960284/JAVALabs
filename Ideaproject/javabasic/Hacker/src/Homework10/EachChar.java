package Homework10;

import java.util.Scanner;

public class EachChar {
    public static void main(String[] args) {
        System.out.println("Please enter a String:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}


/*public class BreakDown {
    public static void main(String[] args) {
        String input = "Octopus";
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
    }
}*/