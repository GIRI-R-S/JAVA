/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
class Car{
    String brand;
    Car(){
        brand="Unknown";
        System.out.println("Brand:"+brand);
    }
    int Setbrand(String brand){
        System.out.println("Brand:"+brand);
        return 0;
    }
}
public class DefaultconstructorForCar{
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    Car hi=new Car();
    System.out.print("Enter brand name:");
    String brand=s.nextLine();
    hi.Setbrand(brand);
}
}