/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


class NestedLoop
{
	public static void main(String[] args) {
		
		int n=4;
			for(int i=1;i<=n;i++)
		{
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=n-i;j>=1;j--)
		    { 
		        if(j==1 || j==n-i)
		        System.out.print("* ");
		        else
		        System.out.print("  ");
		    }
		    System.out.println();
		}
		for(int i=2;i<=n;i++)
		{
		    for(int j=1;j<=n-i;j++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++)
		    { 
		        if(j==1 || j==i)
		        System.out.print("* ");
		        else
		        System.out.print("  ");
		    }
		    System.out.println();
		}
		
	}
}


// class NestedLoop
// {
// 	public static void main(String[] args) {
		
// 		int n=4;
// 		for(int i=1;i<=n;i++)
// 		{
// 		    for(int j=1;j<=n-i;j++)
// 		    {
// 		        System.out.print(" ");
// 		    }
// 		    for(int j=1;j<=i;j++)
// 		    { 
// 		        if(j==1 || j==i)
// 		        System.out.print("* ");
// 		        else
// 		        System.out.print("0 ");
// 		    }
// 		    System.out.println();
// 		}
// 			for(int i=1;i<n;i++)
// 		{
// 		    for(int j=1;j<=i;j++)
// 		    {
// 		        System.out.print(" ");
// 		    }
// 		    for(int j=n-i;j>=1;j--)
// 		    { 
// 		        if(j==1 || j==n-i)
// 		        System.out.print("* ");
// 		        else
// 		        System.out.print("0 ");
// 		    }
// 		    System.out.println();
// 		}
// 	}
// }