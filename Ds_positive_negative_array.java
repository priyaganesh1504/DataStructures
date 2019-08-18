

import java.util.Scanner;

public class Ds_positive_negative_array {
	public static void main(String Srgs[])
    {
        System.out.println("Enter 10 numbers");
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        int i;
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The new Sorted Array is :-");
        System.out.print("{");
        for(i=0;i<10;i++)
        {
            if(a[i]<0)
            {
            	
                System.out.print(a[i]+",");
            }
        }
        System.out.print("}");
        System.out.println(" ");
        System.out.print("{");
        for(i=0;i<10;i++)
        {
            if(a[i]>0)
            {
                System.out.print(a[i]+",");
            }
        }
        System.out.print("}");
        sc.close();
    }
}
