/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class MissingNum
{
	public static void main(String[] args) {
	  int arr[]={11,15,23,32,45,53};
	  int n=7;//start
	  int m=55;//end
	  for(int i=n;i<=m;i++)
	  {
	    
	     for(int j=0;j<arr.length;j++)
	     {
	      
	       if(i==arr[j] )
	         { 
	             System.out.println(n+"-"+(arr[j]-1));
	         }
	         n=arr[j]+1;
	     }
	     
	  }System.out.println(n+"-"+m);
	}
}