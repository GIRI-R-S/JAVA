/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//incomplete......
import java.util.Scanner;

class SumOfuplowTriangle
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
         System.out.print("enter row size=");
        int rsize=scan.nextInt();
         System.out.print("\nenter column size=");
        int csize=scan.nextInt();
        int [][] arr=new int[rsize][csize];
        System.out.println("Enter the elements separated with space:");
         for(int i=0;i<rsize;i++){
            for(int j=0;j<csize;j++){
                arr[i][j]=scan.nextInt();
            }
         }
        for(int i=0;i<rsize;i++){
            for( int j=0;j<csize;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
 
        int sum1=0;//upper Triangle
        int sum2=0;//lower Triangle
        for(int i=0;i<rsize;i++){
            int init=0;
            for(int j=0;j<csize;j++){
                
                if((init==i || i!=j )&& j>i )
                {
                    sum1+=arr[i][j];
                }
                  if((init==i || i!=j )&& j<i )
                {
                    sum2+=arr[i][j];
                }
            } 
            init++;
        }System.out.println(sum1);
        System.out.println(sum2);
        
        
    }
}        
       
    





















