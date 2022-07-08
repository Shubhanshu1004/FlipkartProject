package Java_Questions;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		
		int count = 0;
		
		String str = "Alice is girl and Bob is boy";
		// Declaring a HashMap of <String, Integer>
		Map<String, String> hashMap = new HashMap<>();

		// Splitting the words of string
		// and storing them in the array.
		String[] words = str.split(" ");

		for (String word : words) {
			hashMap.put(word, word);
			
			while(hashMap.get(word) != null) {
				count++;
			}
		}
		
		System.out.println(count);
				
	}

}

