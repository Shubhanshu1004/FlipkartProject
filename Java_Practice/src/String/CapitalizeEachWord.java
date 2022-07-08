package String;

public class CapitalizeEachWord {

	public static void main(String[] args) {

		String s = "this is my new program in java";
		String capitalizedWord = "";

		String[] word = s.split("\\s");

		for (String str : word) {
			
			String firstWord = str.substring(0, 1);
			String afterFirstWord = str.substring(1);
			
			capitalizedWord += firstWord.toUpperCase() + afterFirstWord + " ";

		}

		System.out.println(capitalizedWord.trim());

	}

}


