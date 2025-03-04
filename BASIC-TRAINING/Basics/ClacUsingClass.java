/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
class Calculator{
    private int a,b,c;
    Scanner scan=new Scanner(System.in);
    public void add(){
        System.out.print("Enter a:");
        a=scan.nextInt();
        System.out.print("Enter b:");
        b=scan.nextInt();
        c=a+b;
        System.out.println(c);
    }
    
    public int sub(){
        System.out.print("Enter a:");
        a=scan.nextInt();
        System.out.print("Enter b:");
        b=scan.nextInt();
        c=a-b;
        return c;
    }
    public void mul(int a,int b){
        c=a*b;
        System.out.println("multiplication ="+c);
    }
    
    public int divide(int a,int b)
    {
     c=a/b;
     return c;
    }
}

class ClacUsingClass{
    public static void main(String args[]){
       
        Calculator C=new Calculator();
        System.out.println("ADDITION");
        C.add();
        System.out.println("SUBTRACTION");
        System.out.println("subtraction="+C.sub());
        System.out.println("MULTIPLICATION");
        C.mul(4,5);
        System.out.println("DIVITION");
        System.out.println("division="+C.divide(10,2));
        
    }
}








