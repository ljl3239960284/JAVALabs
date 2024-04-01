package homework3;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        scanner.close();

        // 打印正方形图案
        for (int row = 1; row <= size; row++) { // 外层循环控制行
            for (int col = 1; col <= size; col++) { // 内层循环控制列
                System.out.print("#"); // 根据位置打印#或空格
            }
            System.out.println(); // 每打印完一行后换行
        }
    }
}