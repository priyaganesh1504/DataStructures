import java.util.Scanner;

public class Ds_SubString_Frequency {
	public static int stringOccur(String pat, String txt) {
		 int M = pat.length();         
	        int N = txt.length();         
	        int res = 0; 
	 
	        for (int i = 0; i <= N - M; i++) { 
	           
	            int j;             
	            for (j = 0; j < M; j++) { 
	                if (txt.charAt(i + j) != pat.charAt(j)) { 
	                    break; 
	                } 
	            } 
	  
	
	            if (j == M) {                 
	                res++;                 
	                j = 0;                 
	            }             
	        }         
	        return res;         
	    } 
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String:");
		String txt=scan.nextLine();
		System.out.println("Enter a Sub String of the above String:");
		String pat=scan.nextLine();
		System.out.println("the number of times the sub string occured is: ");
		System.out.println(stringOccur(pat,txt));
		
		
	}

}
