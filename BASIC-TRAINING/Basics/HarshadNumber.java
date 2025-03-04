import java.util.Scanner;
class HarshadNumber{
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.print("Enter Starting Number:");
    int start=in.nextInt();
    System.out.print("Enter Starting Number:");
    int end=in.nextInt();
    int m=end;
    for(int n=start;n<m;n++){
        int x=n;
        int rem;
        int res=0;
    while(x>0)
        {
            rem=x%10;
            res=res+rem;
            x/=10;
        }
        int y=n%res;
        if(y==0)
        System.out.println("Harshad Number is:"+ n);
        
    }
    }
}