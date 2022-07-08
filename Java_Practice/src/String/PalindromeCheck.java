package String;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String reverse = "";

		char[] ch = word.toCharArray();

		for(int i=ch.length-1; i>=0; i--) {
			reverse += ch[i];
		}

		System.out.println(reverse);

		if(reverse.equals(word)) {
			System.out.println(word + " is a Palindrome");
		}

		else {
			System.out.println(word + " is not a Palindrome");
		}

	}

}
