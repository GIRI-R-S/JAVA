/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class ReverseNum
{
	public static void main(String[] args) {
	    int n=596;
	    int s=0;
	    int count=0;
	    while(n>0)
	    {
	      int rem=n%10 ;
	      s=s*10+rem;
	      n/=10;
	      count++;
	    }
		System.out.println("reverse of num:"+s+ "No.of digits "+count);
	}
}