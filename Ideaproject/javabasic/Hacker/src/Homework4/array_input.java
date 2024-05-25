package Homework4;

import java.util.Scanner;

public class array_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[9];
        System.out.println("Enter 9 integers:");


        for (int i = 0; i < 9; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        int avg = 0;
        for (int i = 0; i < 9; i++) {
            count += arr[i];
        }
        avg = count / 9;
        System.out.println("The average is: " + avg);


        System.out.println("The array is:");
        for (int i = 0; i < 9; ) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i]+" ");
                i++;
            }
            System.out.println();
        }
    }
}
