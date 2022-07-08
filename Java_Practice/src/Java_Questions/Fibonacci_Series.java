package Java_Questions;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int a=0, b=1, c=1;
		
		System.out.println("Fibonacci series is: ");

		for(int i=0; i<number; i++) {
			a = b;
			b = c;
			c = a + b;
			
			System.out.print(a + " ");

		}

		sc.close();

	}

}
