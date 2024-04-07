package Homework3;

import java.util.Scanner;

public class CheckerPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        scanner.close();

        // 打印棋盘格图案
        for (int row = 1; row <= size; row++) { // 外层循环控制行
            for (int col = 1; col <= size; col++) { // 内层循环控制列
                // 打印当前位置的图案，根据行列数的奇偶性决定打印'#'或空格
                System.out.print(((row + col) % 2 == 0) ? "#" : " ");
            }
            System.out.println(); // 每打印完一行后换行
        }
    }
}