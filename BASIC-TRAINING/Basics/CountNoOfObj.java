/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
class Car{
     static int count=0;
    Car(){
        count++;
        System.out.println("Object created! cureent count="+count);
    }
    
}
public class CountNoOfObj{
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    Car a=new Car();
    Car b=new Car();
    Car c=new Car();
    Car d=new Car();
}
}