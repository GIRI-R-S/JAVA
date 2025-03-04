import java.util.Scanner;
class Factorial{
    int fact(int rem){
        if(rem<=1)
        return 1;
        else
        return rem*fact(rem-1);
    }
}
class StrongNumber{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        Factorial obj=new Factorial();
        System.out.print("Enter a number:");
        int m=in.nextInt();
        // for (int m=1;m<100000;m++)
        // {
        int n=m;
        int res=0;
        int rem;
        while(n>0){
            rem=n%10;
            int x=obj.fact(rem);
            res=res+x;
            n/=10;
        }
        if(res==m)
        System.out.println(m+" is a Strong Number");
        else
        System.out.println("The given is not a Strong Number");
    //}
    }
}