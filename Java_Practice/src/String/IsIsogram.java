package String;

import java.util.HashSet;
import java.util.Set;

public class IsIsogram {

	public static void main(String[] args) {

		System.out.println(isIsogram("Anshu"));

	}

	public static boolean isIsogram(String s) {

		boolean isogram = true;

		char[] ch = s.toCharArray();
		Set<Character> chSet = new HashSet<Character>();

		for(Character c : ch) {
			if(chSet.contains(c))
				isogram = false;

			else 
				chSet.add(c);
		}

		return isogram;

	}

}
