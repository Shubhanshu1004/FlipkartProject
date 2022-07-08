package String;

import java.util.Scanner;

public class ReverseStringUsingStringBuilder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(word);
		sb.reverse();	
		
		System.out.println(sb.toString());
		
		sc.close();

	}

}
