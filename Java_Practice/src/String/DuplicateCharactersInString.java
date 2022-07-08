package String;

public class DuplicateCharactersInString {

	public static void main(String[] args) {

		String city = "Bangalore";

		char[] anotherCity = city.toCharArray();

		for(int i=0; i<city.length(); i++) {
			for(int j=i+1; j<city.length(); j++) {
				if(anotherCity[i]==anotherCity[j] && anotherCity[i]!=' ' && anotherCity[i]!=0) {
					anotherCity[j]=0;
				}
			}	
		}

		for(int i=0; i<anotherCity.length; i++) {
			if(anotherCity[i] != ' ' && anotherCity[i] != 0) {
				System.out.print(anotherCity[i]);
			}
		}

	}

}
