package Homework3;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sizeOfTable;

        System.out.print("Please enter the size of the multiplication table >");
        sizeOfTable = input.nextInt();

        // 打印表头
        System.out.printf("%-6s", "* |"); // %-6s表示左对齐并占用至少6个字符宽度
        for (int i = 1; i <= sizeOfTable; i++) {
            System.out.printf("%4d", i); // %4d表示右对齐并占用至少4个字符宽度
        }
        System.out.println();

        // 打印分隔线
        System.out.println("--------------------------------------------");

        // 打印乘法表
        for (int i = 1; i <= sizeOfTable; i++) {
            System.out.printf("%4d |", i);
            for (int j = 1; j <= sizeOfTable; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}