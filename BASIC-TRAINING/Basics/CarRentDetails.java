/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
class car{
    float getcarRent(String cartype)
    {
        float rent;
         if(cartype.equals("smallcar"))
        {
             rent=1000f;
            return rent;
        }
         if(cartype.equals("van"))
        {
            rent=1500f;
            return rent;
        }
         if(cartype.equals("suv"))
        {
            rent=2000f;
           return rent;
        }
        
     else
     return 0;
    }
    int getcarid(String cartype)
    {
        int carid;
         if(cartype.equals("smallcar"))
        {
            carid=43648;
           return carid;
        }
         if(cartype.equals("van"))
        {
            carid=65678;
            return carid;
        }
         if(cartype.equals("suv"))
        {
           carid=63887;
          return carid;
        }
       else 
       return 0;
    }
    int showcar(String cartype)
    {
        int carid;
        float rent;
        if(cartype.equals("smallcar"))
        {
            carid=43648;
            rent=1000;
            System.out.println("cartype="+cartype+"\ncarid:"+carid+"\nrent:"+rent);
        }
         if(cartype.equals("van"))
        {
            carid=65678;
            rent=1500;
            System.out.println("cartype="+cartype+"\ncarid:"+carid+"\nrent:"+rent);
        }
         if(cartype.equals("suv"))
        {
          carid=63887;
            rent=2000;
            System.out.println("cartype="+cartype+"\ncarid:"+carid+"\nrent:"+rent);
        }
        else
        return 0;
    }
}

public class CarRentDetails{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String cartype=s.nextLine();
        cartype=cartype.toLowerCase();
        car a=new car();
        // System.out.println(a.showcar(cartype));
         System.out.println(a.getcarid(cartype));
         System.out.println(a.getcarRent(cartype));
    }
}