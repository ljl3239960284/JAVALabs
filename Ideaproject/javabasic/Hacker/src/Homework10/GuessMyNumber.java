package Homework10;
import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int sNum = (int)(1000*rand.nextDouble());

        boolean result = true;
        while(result){
            System.out.print("Enter a number between 1 and 1000: ");
            int guessNum = sc.nextInt();
            if(sNum < guessNum){
                System.out.println("too big");
            }else if(sNum > guessNum){
                System.out.println("too small");
            }else{
                System.out.println("you win!");
                result = false;
            }
        }
    }
}
