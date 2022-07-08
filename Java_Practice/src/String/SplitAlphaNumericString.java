package String;

public class SplitAlphaNumericString {

	public static void main(String[] args) {
		
		// 1st approach
		String word = "ca12b3A";
		String alphabet = "";
		String number = "";
		
		for(int i=0; i<word.length(); i++) {
			
			if(word.charAt(i) >= 97 && word.charAt(i) <= 122 || word.charAt(i) >= 65 && word.charAt(i) <= 90) {
				alphabet += word.charAt(i);
			}
			
			else {
				number += word.charAt(i);
			}
			
		}
		
		System.out.println(alphabet);
		System.out.println(number);
		
		// 2nd approach
		String otherWord = "c1a2b3";
		String otherAlphabet = "";
		String otherNumber = "";
		System.out.println(otherWord.getClass().getName());
	
		char[] charWord = otherWord.toCharArray();
		System.out.println(charWord.getClass().getName());

		for(int i=0; i<otherWord.length(); i++) {
			
			if(charWord[i] >= 97 && charWord[i] <=122) {
				otherAlphabet = otherAlphabet + charWord[i];
			}

			else {
				otherNumber += charWord[i];
			}

		}

		char alphabetArr[] = otherAlphabet.toCharArray();
		char numberArr[] = otherNumber.toCharArray();

		System.out.println(alphabetArr);
		System.out.println(numberArr);

	}

}
