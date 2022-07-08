package Java_Questions;

import java.util.Scanner;

public class DigitsInANumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		int firstDigit = 0;
		int lastDigit = 0;
		
		lastDigit = number%10;
		while(number!=0) {
			firstDigit = number%10;
			number = number/10;
		}
		
		System.out.println("The first and last digit of the entered number are " + firstDigit + " and " + lastDigit);	

	}

}
