package Java_Questions;

import java.util.Scanner;

public class IfElseSolution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		if(number>=1 && number<=100) {
			
			if(number%2!=0) {
				System.out.println("Weird");
			}
			
			else if(number%2==0 && (number>=2 && number<=5)) {
				System.out.println("Not Weird");
			}
			
			else if(number%2==0 && (number>=6 && number<=20)) {
				System.out.println("Weird");
			}
			
			else if(number%2==0 && number>20) {
				System.out.println("Not Weird");
			}
		}
		
		else {
			System.out.println("Enter a number within the range between 1 and 100");
		}

	}

}
