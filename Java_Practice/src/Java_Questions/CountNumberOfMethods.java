package Java_Questions;

import java.lang.reflect.Method;

public class CountNumberOfMethods {
	
	public static void main(String[] args) throws Exception {
		
		int count = 0;
		Class<?> c = Class.forName("java.lang.Object");
		
		Method[] m = c.getDeclaredMethods();
		
		for(Method m1:m) {
			count++;
			System.out.println(m1.getName());
		}
		
		System.out.println("The no of methods: " + count);	
		
	}

}

