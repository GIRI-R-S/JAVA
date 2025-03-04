/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class PascalTriangleRow{
    public static void main(String args[]){
        int n=3;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int c=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(c+" ");
                c=c*(i-j)/j;
            }
            System.out.println();
         
        }
        
    }
}