// Largest Element in the Array

// input:
// 6
// 4 7 8 6 7 6 
// output:
// 8

// explanation:
// The answer is 8.
// From {4 7 8 6 7 6}, 8 is the largest element.

// brute force : TC - O(nlogn) SC: O(1)
// 1.sort the Array
// 2.print the last element

static int largestElement(int[] arr, int n){
    Arrays.sort(arr);
    System.out.println(arr[n-1]);
}

// optimal : TC -> O(n) SC -> O(1)
// 1.take largest as the first element and compare it with all the element
// 2.if the largest is bigger than array element then update largest by array element.

import java.util.* ;
import java.io.*; 
public class Largest_In_Array {
    static int largestElement(int[] arr, int n) {

        int largest = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] > largest)
              largest = arr[i];

        }
        return largest;

    }

    public static void main(String ar[])
    {
        int arr[]={1,4,3,2,5,3,5,3,3,5,2};
        int length = arr.length;
        System.out.print(largestElement(arr,length));
    }


}
