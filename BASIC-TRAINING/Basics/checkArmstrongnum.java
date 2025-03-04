/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

// <--------------------------------------------------------------------------->
// class SumofEvenOddPrime
// {
//     public static void main(String args[])
//     {
//         int n=123456;
//         int rem=0;
//         int Evensum=0;
//         int Oddsum=0;
//         int Primesum=0;
//         while(n>0)
//         {
//             rem=n%10;
//             n=n/10;
//             if(rem%2==0)  //Even and odd sum
//             {
//                 Evensum+=rem;
//             }
//             else
//              Oddsum+=rem;
             
//              int count=0;  // Primesum
//             for(int i=2;i<=rem;i++)
//             {
//                 if(rem%i==0 && count<2)
//                 count++;
//             } if(count<2  && rem!=1)
//                 Primesum+=rem;
//         }
//         System.out.println(Evensum);
//         System.out.println(Oddsum);
//         System.out.println(Primesum);
//     }
// }

// <--------------------------------------------------------------------------->
// class generatePrime{
    
//     public static void main(String s[]){
//         int n=10;
       
//         for(int i=2;i<=n;i++)
//         {
//              int count=0;
//             for(int j=2;j<=i;j++)
//             {
//                 if(i%j==0 && count<2)
//                 count++;
//             }
//             if(count<2)
//             System.out.println(i);
//         }
        
//     }
// }

// <--------------------------------------------------------------------------->
// public class Main
// {
// 	public static void main(String[] args) {
// 	    int count=0;
// 	    int n=10;
// 	    for(int i=2;i<=n;i++)
// 	    {
// 	        if(n%i==0 && count<2)
// 	        {
// 	            count++;
// 	        }
	       
// 	       //else
// 	       //System.out.println("n");
// 	    }if(count<2)
// 	       System.out.println("is prime");
// 		else 
// 		System.out.println("is not prime");
// 	}
// }
// <--------------------------------------------------------------------------->