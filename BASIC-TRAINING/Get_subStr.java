import java.util.Scanner;
class SubString{
    void string(String a){
        String s=a.substring(1,3);
        System.out.println(s);
    }
    void stringbuilder(String a){
        StringBuilder sb=new StringBuilder(a);
        String s=sb.substring(1,3);
        System.out.println(s);
    }
    void stringbuffer(String a){
        StringBuffer sb=new StringBuffer(a);
        String s=a.substring(1,3);
        System.out.println(s);
    }
}

class Get_subStr{
    public static void main (String[] args) {
        SubString x=new SubString();
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        x.string(a);
    }
}
