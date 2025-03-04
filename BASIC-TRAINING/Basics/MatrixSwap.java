/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

class MatrixSwap
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
         System.out.print("enter row size=");
        int rsize=scan.nextInt();
         System.out.print("enter column size=");
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
         int a=rsize-1;
        
        for(int i=0;i<rsize;i++){
             int b=csize-1;
            for( int j=0;j<csize;j++){
             if(i==a && j<b){
                  
                 int temp=arr[i][j];
                 arr[i][j]=arr[i][b];
                 arr[i][b]=temp;
                 b--;
             }
             if(i<a)
             {
                
                 int temp=arr[i][j];
                 arr[i][j]=arr[a][b];
                 arr[a][b]=temp;
                 
                 b--;
             }
           
            }a--;
        }
            for(int i=0;i<rsize;i++){
            for( int j=0;j<csize;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
            }
    }
}





