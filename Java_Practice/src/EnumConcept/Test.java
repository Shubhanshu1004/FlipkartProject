package EnumConcept;

import java.util.Scanner;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Enter country name: ");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		CountryCode code = CountryCode.valueOf(str.toUpperCase());
	
		switch(code) {
		
		case CANADA:
			System.out.println("Hi there...The tax  codes for your selected country are : ");
			Stream.of(CountryCode.CANADA.getTaxCodesArray()).forEach(System.out::println);
			break;
			
		case INDIA:
			System.out.println("Hi there...The tax  codes for your selected country are : ");
			Stream.of(CountryCode.INDIA.getTaxCodesArray()).forEach(System.out::println);
			break;
			
		default:
			System.out.println("Enter correct country name");

		}
		
		sc.close();

	}

}

enum CountryCode {
	
	CANADA(new String[] {"XQ", "RC", "TF"}), 
	INDIA(new String[] {"SGST", "CGST", "VAT"});
	
	 String[] taxCodesArray;
	
	CountryCode(String[] taxCodesArray) {
		this.taxCodesArray = taxCodesArray;
	}
	
	public String[] getTaxCodesArray() {
		return taxCodesArray;
	}
	
}



