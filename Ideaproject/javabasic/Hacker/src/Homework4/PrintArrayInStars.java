package Homework4;

import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int numItems = scanner.nextInt();

        int[] items = new int[numItems];

        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < numItems; i++) {
            items[i] = scanner.nextInt();
        }

        // 打印数组的图形表示
        // ...
        for (int i = 0; i < numItems ; i++){
            System.out.print(i + ":");
            for (int j = 0; j < items[i] ; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        scanner.close();
    }
}