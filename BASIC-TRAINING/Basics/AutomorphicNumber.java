/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.lang.Math;
class AutomorphicNumber{
    public static void main(String args[]){
        for(int n=0;n<10000;n++)
        {
        int s=(n*n);
        int rem=0;
        double res=0;
        int x=0;
        while(s>0){
            rem=s%10;
            s/=10;
            res=((Math.pow(10,x))*rem)+res;
            if(n==res)
            {
                System.out.println(n);
                break;
            }
            // if(res>n)
            // {
            //     System.out.println("Not a Automorphic Number");
            //     break;
            // }
            x++;
        }
        }
        
    }
}
// import java.lang.Math
// class Main{
//     public static void main(String args[]){
//         int n=25;
//         int s=(n*n);
//         int rem=0;
//         int res=0;
//         int x=0;
//         while(s>0){
//             rem=s%10;
//             s/=10;
//             res=(Math.pow(10,x))*rem+res;
//             if(n==res)
//             {
//                 System.out.println("Automorphic Number");
//             }
//             if(res>n)
//             {
//                 System.out.println("Not a Automorphic Number");
//             }
//             x++;
//         }
        
//     }
// }