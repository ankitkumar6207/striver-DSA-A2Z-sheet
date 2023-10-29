/*Left Rotate an Array by One

input:
4
5 7 3 2 

output:
7 3 2 5

explanation:
Move the first element to the last and rest all the elements to the left.

you need not to create new array do rotation in the same array

optimal : TC = O(n) 
1.put the first array element in a temp varible.
2.run a loop from 1 to last and shift element from arr[i] to arr[i-1] 
3.then put the temp element at the last position.
*/

import java.util.* ;
import java.io.*; 


public class Left_Roatate_Array_By_One_Place {

    static int[] rotateArray(int[] arr, int n) {
        int temp  = arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        return arr;

    }
}
