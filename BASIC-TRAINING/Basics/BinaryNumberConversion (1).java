
import java.util.Scanner;
class Conversion{
    void DecimalToOctal(int n){
     int rem;
        double res=0;
        int x=0;
        if(n>=8){
            while(n>0){
            rem=n%8;
            res=(Math.pow(10,x)*rem)+res;
            n=n/8;
            x++;
            }
        }   
        System.out.println("Octal Number:"+res);
    }


    void DecimalToHexa(int n){
        int rem;
        String res="";
        int count=65;
        if(n==0)
        res="0";
        else {
            while(n>0){
            rem=n%16;
            if(rem<10)
             res=rem+res;
            if(rem>=10){
                rem=(char)(count+(rem-10));
            }
            res=res+(char)(rem);
            n=n/16;
            }
        }   
        System.out.println("Hexadecimal Number:"+res);
}
}
class BinaryNumberConversion{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Decimal Number:");
        int n=in.nextInt(); 
        Conversion obj=new Conversion();
        obj.DecimalToOctal(n);
        obj.DecimalToHexa(n);
    }
}







