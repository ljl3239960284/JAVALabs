package homework2;

import java.util.Scanner;

import static java.lang.Math.pow;

public class homework2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int Num = calculater(number);
        System.out.print(Num);
        if (Num == number){
            System.out.print("yes");
        }else {
            System.out.print("not");
        }

    }

    public static int calculater(int number){
        int Num = number;
        int NUM =0;
        int a = 1;
        int n = 0;
        int tempnum = number;
        int Number = number;//计算n次方数
        while (Number != 0){
            Number /= 10;
            n++;
        }

        int i = 0;//求和次数
        //计算次方数之和
        while(i<n){
            int Num1 =0;
            Num1 = tempnum % 10;//取出每一位的数
            NUM += (int) pow(Num1,n);//求和
            tempnum /= 10 ;
            i++;
        }


        return NUM;
    }

}
