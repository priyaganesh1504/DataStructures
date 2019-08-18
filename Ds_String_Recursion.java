

import java.util.Scanner;

public class Ds_String_Recursion {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();
		scan.close();
		String rev=reverseString(s1);
		System.out.println("The reversed String is: "+rev);
	}
	public static String reverseString(String s1) {
		if(s1.isEmpty()) 
			return s1;
		
		
		return reverseString(s1.substring(1))+s1.charAt(0);
	
	}
}
