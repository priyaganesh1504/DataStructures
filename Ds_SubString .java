import java.util.Scanner;

public class Ds_SubString {
	public static int subStringCount(String str) {
		int n=str.length();
		return n*(n+1)/2;
	}
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();
		System.out.println(subStringCount(s1));
		scan.close();
	}
}
