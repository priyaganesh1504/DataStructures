import java.util.Scanner;

public class Ds_Compare_String {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first String:");
		String s1=scan.nextLine();
		System.out.println("Enter the Second String");
		String s2=scan.nextLine();
		scan.close();
		if(s1.length()!=s2.length()) {
			System.out.println("The Given two Strings are not equal");
			return;
		}
		boolean flag=true;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Strings are Same");
		}
		else
			System.out.println("Strings are Different");
		
	}
}
