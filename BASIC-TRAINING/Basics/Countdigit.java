/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Countdigit{
    public static void main(String args[]){
        int arr[]={3,2,3,1,2,9};
        
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j] && arr[i]!=0)
                {
                    arr[j]=0;
                    count++;
                }
            }
            if(arr[i]!=0)
             System.out.println(arr[i]+" " +count);
            
            
        }
    }
}