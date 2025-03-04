/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

class Info{
    Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        int regno=scan.nextInt();
                                //     String arr1[]=new String[3];
                                //   void store(int i,int n){
                                       
                                //       arr1[i]=name;
                                //       System.out.println("arr1["+i+"]="+arr1[i]);
                                //   }
                                //     void printarr()
                                //     {for(int i=0;i<3;i++){
                                //         System.out.print(arr1[i]+" ");
                                //     }}
        void print(){
         System.out.println(name+" "+ regno);
        }
}
class ClassObjBasic{
    public static void main(String args[]){
        
        int n=2;
        for(int i=0;i<n;i++){
            System.out.print("Enter your name and regno:");
            Info student=new Info();
            student.print();
                            // student.store(i,n);
                            // student.printarr();
        }
        
       
    }
}