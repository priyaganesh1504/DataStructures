import java.util.Scanner;

public class Ds_String_compare_without_Inbuilt {
		public static void main(String args[]) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the First String:");
			String s1=scan.nextLine();
			System.out.println("Enter the Second String:");
			String s2=scan.nextLine();
			scan.close();
			if(s1.equals(s2)) {
				System.out.println("The Entered two Strings are equal");
			}
			else
				System.out.println("The Entered Strings are not equal");
		}
}
