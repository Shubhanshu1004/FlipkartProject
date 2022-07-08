package String;

// Ex- String = My name is Anshu
// String = yM eMAN sI uHSNA

public class ReverseToggleEachWord {

	public static void main(String[] args) {
		
		String s = "My name is Anshu";
		String toggledWord = "";
		
		ReverseToggleEachWord.reverseString(s);
		
		String[] words = s.split("\\s");
		
		for(String str: words) {
			
			ReverseToggleEachWord.reverseString(str);
			
			String firstWord = str.substring(0, 1);
			String afterFirstWord = str.substring(1);
			
			toggledWord += firstWord + afterFirstWord.toUpperCase() + " "; 
			
		}
		
		System.out.println(toggledWord.trim());

	}
	
	public static String reverseString(String str) {
		
		String reverse = "";
		
		char[] ch = str.toCharArray();
		for(int i=ch.length-1; i>=0; i--) {
			reverse += ch[i]; 
		}
		
		return reverse;
		
	}

}
