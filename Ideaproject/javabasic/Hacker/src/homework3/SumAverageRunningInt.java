package Homework3;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 100;
        int sum = 0;
        double average;

        for (int i = lowerbound; i <= upperbound; i++) {
            sum += i;
        }

        average = (double) sum / (upperbound - lowerbound + 1);

        System.out.println("The sum of " + lowerbound + " to " + upperbound + " is " + sum);
        System.out.println("The average is " + average);
    }
}