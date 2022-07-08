package String;

// Ex- String = my name is Anshu
// Toggled string = mY nAME iS aNSHU

public class ToggleEachWord {

	public static void main(String[] args) {
	
		String s = "My name is Anshu";
		String toggledString = "";
		
		String[] words = s.split("\\s");
		
		for(String str: words) {
			
			String firstWord = str.substring(0, 1);
			String afterFirstWord = str.substring(1);
			
			toggledString += firstWord.toLowerCase() + afterFirstWord.toUpperCase() + " ";
			
		}
		
		System.out.println(toggledString);

	}

}
