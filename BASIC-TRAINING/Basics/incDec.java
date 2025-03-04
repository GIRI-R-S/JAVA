/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class incDec
{
	public static void main(String[] args) {
	 int a=10;
    int b= --a + --a + --a + --a;
    a=10;
    int c= a++ + ++a + ++a + a++ + ++a;
    a=10;
    int d= --a + ++a + --a + --a;
	 System.out.println(b);
	 System.out.println(c);
	 System.out.println(d);
	}
}