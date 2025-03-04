/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

class InputArray
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
        
   //sorting in ascending order:    
        for(int i=0;i<rsize;i++){
            for(int j=0;j<csize;j++){
                for(int a=0;a<rsize;a++){
                    for(int b=0;b<csize;b++){
                      if(arr[i][j]<arr[a][b])
                      {
                          int temp;
                          temp=arr[i][j];
                          arr[i][j]=arr[a][b];
                          arr[a][b]=temp;
                      }
                        
                    }
                }
                
                }   
            }
           
         
         for(int i=0;i<rsize;i++){
            for( int j=0;j<csize;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        
    }
        
        
    }





















