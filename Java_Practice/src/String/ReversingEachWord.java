package String;

public class ReversingEachWord {

	public static String reverseString(String str) {

		char[] ch = str.toCharArray();
		String reverse = "";

		for(int i=ch.length-1; i>=0; i--) {
			reverse += ch[i];
		}

		return reverse;

	}

	public static void main(String[] args) {

		String s = "My name is Shubhanshu";
		
		String[] string = s.split("\\s");
		
		for (String string2 : string) {
			
			String str = reverseString(string2);
			System.out.print(str + " ");
			
		}

	}

}
