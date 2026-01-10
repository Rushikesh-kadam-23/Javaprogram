package Array;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {

        int arr[] = {8,2,7,4,5};
         int temp;
        for(int i=0;i<arr.length;i++){

           for(int j=arr.length-1;j>i;j--){

               temp=arr[j];
               arr[j]=arr[j-1];
               arr[j-1]=temp;

           }

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }

         }

        }



