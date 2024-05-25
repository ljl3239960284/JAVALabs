package Homework3;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // 判断一个数是否是快乐数
        boolean isHappy = isHappyNumber(number);
        if (isHappy) {
            System.out.println("Yes, " + number + " is a happy number.");
        } else {
            System.out.println("No, " + number + " is not a happy number.");
        }
    }

    // 递归方法判断一个数是否是快乐数
    public static boolean isHappyNumber(int n) {
        if (n == 1) return true; // 如果是1，则是快乐数
        Set<Integer> seen = new HashSet<>();
        while (!seen.contains(n)) {
            seen.add(n);
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
            if (n == 4) return false; // 如果在循环中出现4，则不是快乐数
        }
        return true; // 如果进入了循环，则不是快乐数
    }
}