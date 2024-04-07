package homework1;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the taxable income: $");
            double income = scanner.nextDouble();
            if (income <= 0) {
                System.out.println("Invalid input. Please enter a positive taxable income.");
                continue;
            }

            double taxPayable = calculateTax(income);
            System.out.printf("The income tax payable is: $%.2f\n", taxPayable);

            // 如果你想要结束循环，可以添加一个条件来判断用户是否想要继续计算
            // 如果用户输入 "exit" 或者其他结束信号，你可以通过 scanner.nextLine() 来接收输入
            // 然后检查输入是否为 "exit"，如果是，则 break 退出循环
        }
    }

    public static double calculateTax(double income) {
        double tax = 0.0;

        if (income <= 20000) {
            tax = 0.0;
        } else if (income <= 20000) {
            tax = income * 0.0;
        } else if (income <= 40000 && income >= 20000) {
            tax = (income - 20000) * 0.1;
        } else if (income <= 60000 && income >= 40000) {
            tax = (income - 40000) * 0.2 + 20000*0.1;
        } else {
            tax = (income - 60000) * 0.3 + 20000*0.1 + 20000*0.2;
        }

        return tax;
    }
}
