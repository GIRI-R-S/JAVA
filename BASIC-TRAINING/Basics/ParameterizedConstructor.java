/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
class Car{
     static int count=0;
     String model;
    Car(){
        count++;
        System.out.println("Object created! cureent count="+count);
    }
    Car(String model){
        this.model=model;
    }
    void display(){
        System.out.println("Model:"+model);
    }
}
public class ParameterizedConstructor{
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    String model=s.nextLine();
    Car a=new Car(model);
    a.display();
    
    
}
}