package application;

import java.security.SecureRandom;
import java.util.Scanner;

public class Program {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in);
		SecureRandom sr = new SecureRandom();
		
		int randon = 1 + sr.nextInt(14);
		System.out.println("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15\nWhat is ny nunber?");
		int number = sc.nextInt();
		
		while(true) {
			statisticNumber(randon, number);	
			if (randon == number) {
			break;
			}
			number = sc.nextInt();
		}				
		sc.close();
	}
	
	public static void statisticNumber(int randon, int number) {
		if (number < randon) {
			System.out.println("wrong, my number is highest");
		}
		else if (number > randon) {
			System.out.println("wrong, my number is less");
		}
		else {
			System.out.println("thats my number!!");
		}
	}

}
