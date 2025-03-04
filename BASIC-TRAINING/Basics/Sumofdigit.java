/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
//output <10 single digit only.
public class Sumofdigit
{
	public static void main(String[] args) {
		int x=5515;
		
		int sum=0;
		int sum1=0;
	   while(x>0)
	   {
	       sum+=x%10;
	       x/=10;
	   }
	   if(sum>=10)
	    {
	        while(sum>0)
	        {
	              sum1+=sum%10;
	                sum/=10;  
	        }
	   
	   }
	 
	   //if(sum<10)
	   //System.out.println(sum);
	   //else
	   System.out.println(sum1);
	}
}