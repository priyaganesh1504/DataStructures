import java.util.Scanner;

public class DS_String_Concate {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First String:");
		String s1 = scan.nextLine();
		System.out.println("Enter the Second String: ");
		String s2 = scan.nextLine();
		scan.close();
		System.out.print("Concatination of two Strings is: ");
		System.out.println(s1+" "+s2);
	}
}
