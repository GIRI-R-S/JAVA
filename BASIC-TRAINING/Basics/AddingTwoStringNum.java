import java.util.Scanner;
class AddingTwoStringNum{
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Num1:");
        String num1=in.nextLine();
        System.out.print("Enter Num2:");
        String num2=in.nextLine();
        int a=num1.length();
        int b=num2.length();
        int greater=(a>b)?a:b;
        int temp=0;
        long sum=0;
        int d=0;
        for(int i=1;i<=greater;i++)
        {
            
            if(a==b){
            
            int x=num1.charAt(a-i)-'0';
            int y=num2.charAt(b-i)-'0';
            temp=x+y+temp;
            sum=((temp%10)*((long)Math.pow(10,d)))+sum;
            temp/=10;
            d++;
            }
            
            if(a>b){
            int x=num1.charAt(a-i)-'0';
            int y;
            if(b>=i)
             y=num2.charAt(b-i)-'0';
            else 
            y=0;
            temp=x+y+temp;
            sum=((temp%10)*((long)Math.pow(10,d)))+sum;
            temp/=10;
            d++; 
            }
            
             if(a<b){
            int y=num2.charAt(b-i)-'0';
            int x;
            if(a>=i)
             x=num1.charAt(a-i)-'0';
            else 
            x=0;
            temp=x+y+temp;
            sum=((temp%10)*((long)Math.pow(10,d)))+sum;
            temp/=10;
            d++; 
            }
           
        } 
        System.out.println("Sum:"+sum);
    }
}