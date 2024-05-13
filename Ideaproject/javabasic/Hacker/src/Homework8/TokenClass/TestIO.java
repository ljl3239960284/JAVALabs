package Homework8.TokenClass;

import java.util.Scanner;


class TestIO {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Pls enter sth>");
		System.out.print("You enter" + scanner.nextLine());

		for (int i = 0; i < args.length; i++) {
			System.out.print("arg[" + i + "]=" + args[i]);
		}
	}
}