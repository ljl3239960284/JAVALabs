package Homework10;

public class NumberContainsSeven {
    public static boolean hasSeven(int number) {
        while (number > 0) {
            if (number % 10 == 7) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static int magicSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (hasSeven(num)) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {7, 70, 707, 90};
        System.out.println("Sum of numbers containing the digit 7: " + magicSum(arr));
    }
}