/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Conditional
{
	public static void main(String[] args) {
	 
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a num:");
    int n=input.nextInt();
     int count=0;
	 for(int i=2;i<=n;i++)
	 {
	     if(n%i==0 && count<2)
	     {
	      count++;
	     }
	    
	 }
	 if(count>1)
	     System.out.println("not a prime");
	 else
	     System.out.println("prime");
	}
}