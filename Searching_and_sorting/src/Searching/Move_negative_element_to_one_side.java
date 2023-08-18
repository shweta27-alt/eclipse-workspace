package Searching;
import java.util.*;

public class Move_negative_element_to_one_side {
//   public static void main(String[] args){
//	   int n;
//	   int[]arr= {-29,4,12,-55,4,7,-7};
//	   System.out.print(rearrange(arr,5));
// }
//   static void rearrange(int arr[],int n) {
//	   int i=-1,temp=0;
//	   for(int j=0;j<n;j++) {
//		   if(arr[j]<0) {
//			   i++;
//			   temp = arr[i];
//			   arr[i]=arr[j];
//			   arr[j]=temp;
//		   }
//	   }
//	   int pos = i+1,neg =0;
//	   while(pos <n && neg<pos && arr[neg]<0) {
//		   temp = arr[neg];
//		   arr[neg]= arr[pos];
//		   arr[pos]= temp;
//		   pos++;
//		   neg+=2;
//	   }
// }
//}

    static void rearrange(int arr[], int n)
    {
        int j = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
 
    // A utility function to print an array
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
 
    // Driver code
    public static void main(String args[])
    {
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int n = arr.length;
 
        rearrange(arr, n);
        printArray(arr, n);
    }
}
 