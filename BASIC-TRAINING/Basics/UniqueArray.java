/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class UniqueArray{
    public static void main(String args[])
    {
        int arr[]={3,2,3,1,5,7,4,7,5,3,2,9};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                 arr[j]=0;
            }
        
        }
            
        for(int x:arr){
            if(x==0)
            continue;
            System.out.print(x+" ");
        }
    }}
