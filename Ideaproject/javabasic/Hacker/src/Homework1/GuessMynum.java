package Homework1;

import java.util.Scanner;

public class GuessMynum {
    public static void main(String args[]){
        int num = (int) (Math.random()*1000);
        Scanner input = new Scanner(System.in);
        System.out.println("you can have max 10 tries");
        System.out.print("Random number has been generated,please enter num>");
        int guess = input.nextInt();
        int numOfGuess = 1;

        while(guess != num && numOfGuess<=10){
            if (guess>num){
                System.out.print("too big Please the guess my Number>");
            }else{
                System.out.print("too small!Please the guess myNumber>");
            }
            numOfGuess = numOfGuess + 1;
            guess = input.nextInt();
        }
        if (num == guess){
            System.out.println("Yas you are right, correct num is "+num);
        }else{
            System.out.println("Sorry you failed to guess my secret number"+num);
        }
    }

}
