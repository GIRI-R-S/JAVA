/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class CarrytoRight {
	public static void main(String args[]) {
		int A[]= {5,1,3,4};
		int B[]={9,7,7};
		int x;
		int n=0;
		int y=0;
		for(int i=0;i<A.length;i++)
		{
		    if(A.length==B.length)
		    {
		    x=A[i]+B[i]+y;
		    n=x%10;
		    if(i!=A.length-1  ){
		    y=x/10;
		    System.out.print(n+" ");
		    }
		    else
		    System.out.print(x);
		    }
		}
		   if(A.length<B.length)
		   {
		       
		       for(int j=0;j<B.length;j++)
		       {
		          if(j<A.length)
		          {
		           x=A[j]+B[j]+y;
		           n=x%10;
		           System.out.print(n+" "); 
		           y=x/10;
		          }
		         
		           if(j>=A.length)
		        {  
		          x=B[j]+y;
		          y=0;
		          n=x%10;
		          System.out.print(n+" ");
		          if(B[j]==B.length-1)
		          y=x/10;
		        }
		        
		       }
		       
		   }
		   
		   if(A.length>B.length)
		   {
		       
		       for(int j=0;j<A.length;j++)
		       {
		          if(j<B.length)
		          {
		           x=A[j]+B[j]+y;
		           n=x%10;
		           System.out.print(n+" "); 
		           y=x/10;
		          }
		         
		           if(j>=B.length)
		        {  
		          x=A[j]+y;
		          y=0;
		          n=x%10;
		          System.out.print(n+" ");
		          if(A[j]==A.length-1)
		          y=x/10;
		        }
		        
		       }
		       
		   }
		    
		}
	
	}
























