

import java.util.Scanner;

public class Ds_Swap_Without_Temp {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number to be Swapped");
		int x=scan.nextInt();
		System.out.println("Enter the second number to be Swapped");
		int y=scan.nextInt();
		System.out.println("Enter the third number to be Swapped");
		int z=scan.nextInt();
		scan.close();
		x=x+y+z;
		y=x-y-z;
		z=x-y-z;
		x=x-y-z;
		System.out.println("the value of x: "+x);
		System.out.println("the value of y: "+y);
		System.out.println("the value of z: "+z);
		
	}
}
