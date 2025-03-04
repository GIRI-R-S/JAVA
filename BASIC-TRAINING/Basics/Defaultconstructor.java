/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Hello{
    String title;
    float price;
    Hello(){
        title="Java Programming";
        price=100f;
        System.out.println("Book Title:"+title+"\nBook Price:"+price);
    }
}
public class Defaultconstructor{
    public static void main(String args[]){
    Hello hi=new Hello();
}
}