package Java_Questions;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		
		int[] arr  = {2, 4, 4, 74, 290, 23, 54, 2};
		for (int i : arr) {
			l.add(i);
		}
		
		System.out.println(l);
		
		for(int i=0; i<l.size(); i++) {
			for(int j=0; j<l.size(); j++) {
				if(l.get(i)==l.get(j) && i!=j) {
					l.remove(j);
				}
			}
		}
		
		System.out.println(l);
		
	}

}
