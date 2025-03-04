/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// class ArrayTwo{
//     public static void main(String s[]){
        
//         int arr[]={1,3,0,6,0,0,6,3,6,8,5,0};
//         int temp;
//         for(int i=0;i<arr.length;i++){
//         if(arr[i]==0)
//         {
//             temp=arr[i];
//             int j=i+1;
//                  while(j<arr.length)
//                     { if(arr[j]!=0)
//                          {
//                              arr[i]=arr[j];
//                              arr[j]=temp;
//                              break;
//                           }       
//                      else
//                           j++;
            
//                     }
//          }
       
//     } for(int r:arr)
//         {
//             System.out.print(r);
//         }
// }
// }





// <------------------------------------------------------------------------------>
// class ArrayTwo
// {
//     public static void main(String args[])
//     {
//         int arr[]={1,1,0,1,2,0,4,3,0,1,0,1,1,0,1};
//         int temp;
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]==0)
//             {
//                 temp=arr[i];
//                 int j=i+1;
//             while(j<arr.length)
//             {
//                 if(arr[j]!=0)
//                 {
//                     arr[i]=arr[j];
//                     arr[j]=temp;
//                     break;
//                 }
//                 else
//                  j++;
//             }
//         }
       
//     }
//     for(int i:arr)
//     {
//         System.out.print(i);
//     }
// }
// }
// <------------------------------------------------------------------------------>
// public class ArrayTwo
// {
// 	public static void main(String[] args) {
// 	 int arr[]={1,1,0,1,1,0,0,1,0,1,1,1,0};
// 	 int count=0;
// 	 int maxcountof1=0;
// 	 int maxcountof0=0;
// 	 for(int i=0;i<arr.length;i++)
// 	 {
// 	     if(arr[i]==1)
// 	     count++;
// 	     else
// 	     {
//           if(count>maxcountof1)
// 	      maxcountof1=count;
// 	      count=0;
// 	     }
// 	      }
	      
// 	   for(int i=0;i<arr.length;i++)
// 	   {
// 	     if(arr[i]==0)
// 	     count++;
// 	     else{
// 	         if(count>maxcountof0)
// 	         maxcountof0=count;
// 	         count=0;
// 	     }
// 	   }
	   
// 	 System.out.println(maxcountof1);
// 	 System.out.println(maxcountof0);
// 	}
// }