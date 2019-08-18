import java.util.Scanner;

public class DS_String_Without_Recursion {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String rev = new StringBuilder(str).reverse().toString();
		scan.close();
		System.out.println("the reversed String is: " + rev);
	}
}
