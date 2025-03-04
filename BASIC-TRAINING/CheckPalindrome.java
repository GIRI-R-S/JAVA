import java.util.Scanner;
class Palindrome{
     
     void withoutbuiltIn(String a){
         int b=a.length()-1;
         String temp="";
        for(int i=b;i>=0;i--) {
            temp=temp+a.charAt(i);
        }
        if(a.equals(temp))
        System.out.println("is Palindrome");
        else
        System.out.println("is not palindrome");
     }
     void string(String a){
           String temp="";
           int b=a.length()-1;
        for(int i=b;i>=0;i--) {
            temp=temp+a.charAt(i);
        }
        if(a.equals(temp))
        System.out.println("is Palindrome");
        else
        System.out.println("is not palindrome");
        
     }
     
     void stringbuilder(String a){
         StringBuffer sb=new StringBuffer(a);
         StringBuffer revstr=new StringBuffer(a);
         revstr.reverse();
         if(a.equals(revstr.toString()))
         System.out.println("is palindrome");
         else
         System.out.println("is not palindrome");
     }
     
     void stringbuffer(String a){
         StringBuffer sb=new StringBuffer(a);
         StringBuffer revstr=new StringBuffer(a);
         revstr.reverse();
         if(a.equals(revstr.toString())){
             System.out.println("is palindrome");
             
         }
         else
         System.out.println("is not palindrome");
     }
}

class CheckPalindrome{
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a Stirng:");
        String a=in.nextLine();
        Palindrome p=new Palindrome();
        p.withoutbuiltIn(a);
        p.string(a);
        p.stringbuilder(a);
        p.stringbuffer(a);
        
    }
}